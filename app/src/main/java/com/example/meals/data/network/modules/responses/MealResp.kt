package com.example.meals.data.network.modules.responses

import com.example.meals.data.network.factory.TagList
import com.example.meals.domain.model.Ingredient
import com.example.meals.domain.model.Meal
import com.example.meals.utils.asFullImageUrl
import com.squareup.moshi.Json

class MealResp(
    @Json(name = "idMeal") val idString: String,
    @Json(name = "strMeal") val name: String,
    @Json(name = "strMealThumb") val image: String,
    @TagList @Json(name = "strTags") val tags: List<String>?,
    @Json(name = "strInstructions") val instructions: String?,
    @Json(name = "strIngredient1") val ingredient1: String?,
    @Json(name = "strIngredient2") val ingredient2: String?,
    @Json(name = "strIngredient3") val ingredient3: String?,
    @Json(name = "strIngredient4") val ingredient4: String?,
    @Json(name = "strIngredient5") val ingredient5: String?
) {
    companion object {

        fun List<MealResp>.toMeals() = map { it.toMeal() }

        fun MealResp.toMeal() = Meal(
            id = idString.toInt(),
            name = name,
            image = image,
            tags = tags,
            instructions = instructions,
            ingredients = listOfNotNull(
                Ingredient(1, ingredient1.orEmpty(), ingredient1?.asFullImageUrl().orEmpty()),
                Ingredient(2, ingredient2.orEmpty(), ingredient2?.asFullImageUrl().orEmpty()),
                Ingredient(3, ingredient3.orEmpty(), ingredient3?.asFullImageUrl().orEmpty()),
                Ingredient(4, ingredient4.orEmpty(), ingredient4?.asFullImageUrl().orEmpty()),
                Ingredient(5, ingredient5.orEmpty(), ingredient5?.asFullImageUrl().orEmpty())
            ).filter { it.name.isNotEmpty() }
        )
    }
}
