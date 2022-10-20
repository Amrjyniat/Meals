package com.example.meals.domain.repo

import com.example.meals.data.network.ApiResult
import com.example.meals.domain.model.Meal
import kotlinx.coroutines.flow.Flow

interface MainRepository {

    fun loadMeals(): Flow<ApiResult<List<Meal>>>

    fun loadMealDetails(mealName: String): Flow<ApiResult<Meal>>
}
