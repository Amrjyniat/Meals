package com.example.meals.ui.meal_details

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.meals.domain.repo.MainRepositoryImpl
import com.example.meals.utils.myShareIn
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MealDetailsViewModel @Inject constructor(
    mainRepo: MainRepositoryImpl,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val mealName = savedStateHandle.get<String>(MEAL_NAME_ARG).orEmpty()

    val mealDetails = mainRepo.loadMealDetails(mealName)
        .myShareIn(viewModelScope, replay = 1)

    companion object {
        const val MEAL_NAME_ARG = "mealName"
    }
}
