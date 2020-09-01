package com.example.mealsapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MealCategoryDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMealsCategory(mealCategory: List<MealsCategoryDb>)

    @Query("SELECT * FROM meals_category_list")
    fun getListMealsCategory(): LiveData<List<MealsCategoryDb>>

}