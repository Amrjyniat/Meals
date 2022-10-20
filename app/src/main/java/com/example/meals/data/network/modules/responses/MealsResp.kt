package com.example.meals.data.network.modules.responses

import com.squareup.moshi.Json

class MealsResp(
    @Json(name = "meals") val listMealResp : List<MealResp>
)
