package com.example.mealsapp.repositories

import androidx.lifecycle.Transformations
import com.example.mealsapp.database.MealsDatabase
import com.example.mealsapp.database.convertDbToModel
import com.example.mealsapp.modules.responses.convertApiMealsToDb
import com.example.mealsapp.network.Network
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MealsCategoryRepository(private val mealsDatabase: MealsDatabase) {

    suspend fun refreshMealsCategory() {
        withContext(Dispatchers.IO){
            val listMealsCategory = Network.mealService.getMealsCategoriesAsync().await()
            mealsDatabase.mealDao.insertMealsCategory(
                convertApiMealsToDb(
                    listMealsCategory.categoriesMealApis
                )
            )
        }
    }

    val listMeals = Transformations.map(mealsDatabase.mealDao.getListMealsCategory()){ it.convertDbToModel() }

}