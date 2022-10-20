package com.example.meals.data.network

import com.example.meals.data.network.modules.responses.MealsResp
import retrofit2.http.GET
import retrofit2.http.Query

interface MealsService {
    @GET("search.php")
    suspend fun getMeals(
        @Query("f") query: String = "b"
    ): ApiResult<MealsResp>

    @GET("search.php")
    suspend fun getMealDetails(
        @Query("s") mealName: String
    ): ApiResult<MealsResp>
}