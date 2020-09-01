package com.example.mealsapp.modules.responses

import com.example.mealsapp.database.MealsCategoryDb
import com.example.mealsapp.modules.MealCategoryApi
import com.squareup.moshi.Json

class ResponseMeals (
    @Json(name = "categories")
    val categoriesMealApis: List<MealCategoryApi>
)

fun convertApiMealsToDb(responseMealApis: List<MealCategoryApi>): List<MealsCategoryDb>{
    return responseMealApis.map {
        MealsCategoryDb(
            nameCategory = it.nameCategory,
            descCategory = it.descCategory,
            imageCategoryUrl = it.imageCategoryUrl,
            idCategory = it.idCategory
        )
    }
}