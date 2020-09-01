package com.example.mealsapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mealsapp.modules.MealCategory

@Entity(tableName = "meals_category_list")
class MealsCategoryDb (
    @PrimaryKey
    val idCategory: String,
    val nameCategory: String,
    val imageCategoryUrl: String,
    val descCategory: String
)

fun List<MealsCategoryDb>.convertDbToModel(): List<MealCategory>{
    return map {
        MealCategory(
            idCategory = it.idCategory,
            nameCategory = it.nameCategory,
            descCategory = it.descCategory,
            imageCategoryUrl = it.imageCategoryUrl
        )
    }
}
