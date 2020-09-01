package com.example.mealsapp.modules

import com.squareup.moshi.Json

class MealApi(
    @Json(name = "strMeal")
    val nameMeal: String,

    @Json(name = "strMealThumb")
    val imageUrlMeal: String,

    @Json(name = "idMeal")
    val idMeal: String
)