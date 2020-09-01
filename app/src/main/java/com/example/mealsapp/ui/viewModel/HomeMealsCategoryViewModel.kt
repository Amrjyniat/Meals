package com.example.mealsapp.ui.viewModel

import android.app.Application
import androidx.lifecycle.*
import com.example.mealsapp.database.MealsDatabase
import com.example.mealsapp.repositories.MealsCategoryRepository

enum class StatusConnection{LOADING, FAILURE, DONE}

class HomeMealsCategoryViewModel(application: Application) : AndroidViewModel(application){

    private val database = MealsDatabase.getDBInstance(application)
    private val repository = MealsCategoryRepository(database)

    private var _mealCategoryNavigate = MutableLiveData<String>()
    val mealCategoryApiNavigate: LiveData<String>
        get() = _mealCategoryNavigate

    val listMeals = repository.listMeals

    fun onMealCategoryClicked(idCategory: String){
        _mealCategoryNavigate.value = idCategory
    }

    fun doneNavigateToMealCategory(){
        _mealCategoryNavigate.value = null
    }

    /**
     * Factory for constructing DevByteViewModel with parameter
     */
    class Factory(val app: Application) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(HomeMealsCategoryViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return HomeMealsCategoryViewModel(app) as T
            }
            throw IllegalArgumentException("Unable to construct viewmodel")
        }
    }

}