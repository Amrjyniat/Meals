package com.example.meals.ui.meals

import androidx.navigation.fragment.FragmentNavigator

sealed interface MealsEvent{
    object LoadMeals: MealsEvent
    class NavigateToMealDetails(
        val mealName: String,
        val extras: FragmentNavigator.Extras
    ): MealsEvent
}