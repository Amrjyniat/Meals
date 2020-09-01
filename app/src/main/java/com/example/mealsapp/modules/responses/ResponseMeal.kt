package com.example.mealsapp.modules.responses

import com.example.mealsapp.modules.MealApi
import com.squareup.moshi.Json

class ResponseMeal(
    @Json(name = "meals")
    val listMeals : List<MealApi>
)
