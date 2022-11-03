package com.example.meals.ui.meal_details

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.meals.data.repository.MainRepository
import com.example.meals.di.RemoteRepository
import com.example.meals.utils.myShareIn
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MealDetailsViewModel @Inject constructor(
    @RemoteRepository mainRepo: MainRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val mealName = MealDetailsFragmentArgs
        .fromSavedStateHandle(savedStateHandle).mealName

    val mealDetails = mainRepo.loadMealDetails(mealName)
        .myShareIn(viewModelScope, replay = 1)

}
