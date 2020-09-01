package com.example.mealsapp.ui.viewModel

import androidx.lifecycle.*
import com.example.mealsapp.modules.MealApi
import com.example.mealsapp.network.Network
import kotlinx.coroutines.*
import timber.log.Timber

class ListMealsViewModel(val idCategory: String) : ViewModel() {

    private val coroutineJob = Job()
    private val uiScope = CoroutineScope(coroutineJob + Dispatchers.Main)

    private var _status = MutableLiveData<StatusConnection>()
    val status: LiveData<StatusConnection>
        get() = _status

    private var _listMeals = MutableLiveData<List<MealApi>>()
    val listMeals: LiveData<List<MealApi>>
        get() = _listMeals


    init {
        uiScope.launch {
            initialized()
        }
    }

    private suspend fun initialized() {
        withContext(Dispatchers.IO) {
            try {
                _status.postValue(StatusConnection.LOADING)
                val listMeals = Network.mealService.getListMealsAsync(idCategory).await().listMeals
                _status.postValue(StatusConnection.DONE)
                _listMeals.postValue(listMeals)
            } catch (e: Exception) {
                Timber.i("error retrofit: ${e.message}")
                _status.postValue(StatusConnection.FAILURE)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }

}

class ListMealsViewModelFactory(val idCategory: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ListMealsViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ListMealsViewModel(idCategory) as T
        }
        throw IllegalArgumentException("Unable to construct viewmodel")
    }

}
