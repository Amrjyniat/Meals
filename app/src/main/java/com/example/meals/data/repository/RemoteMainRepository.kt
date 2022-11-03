package com.example.meals.data.repository

import com.example.meals.data.network.modules.responses.MealResp.Companion.toMeal
import com.example.meals.data.network.modules.responses.MealResp.Companion.toMeals
import com.example.meals.data.network.ApiError
import com.example.meals.data.network.ApiLoading
import com.example.meals.data.network.ApiSuccess
import com.example.meals.data.network.MealsService
import com.example.meals.utils.loadingResultFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteMainRepository @Inject constructor(
    private val service: MealsService
) : MainRepository {

    override fun loadMeals() = loadingResultFlow {
        when (val realResult = service.getMeals()) {
            is ApiSuccess -> ApiSuccess(realResult.data.listMealResp.toMeals())
            is ApiError -> ApiError(realResult.code, realResult.message.orEmpty())
            else -> ApiLoading()
        }
    }

    override fun loadMealDetails(mealName: String) = loadingResultFlow {
        when (val realResult = service.getMealDetails(mealName)) {
            is ApiSuccess -> ApiSuccess(realResult.data.listMealResp.first().toMeal())
            is ApiError -> ApiError(realResult.code, realResult.message.orEmpty())
            else -> ApiLoading()
        }
    }

}