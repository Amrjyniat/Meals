package com.example.meals.ui.meals

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.meals.domain.repo.MainRepositoryImpl
import com.example.meals.utils.myShareIn
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(
    private val mainRepo: MainRepositoryImpl
) : ViewModel() {

    private val _event = Channel<MealsEvent>()
    val event = _event.receiveAsFlow()
        .myShareIn(viewModelScope)
    fun sendEvent(event: MealsEvent) = viewModelScope.launch {
        _event.send(event)
    }

    init { sendEvent(MealsEvent.LoadMeals) }

    val meals = event.filterIsInstance<MealsEvent.LoadMeals>().flatMapLatest {
        mainRepo.loadMeals()
    }.myShareIn(viewModelScope, replay = 1)

}