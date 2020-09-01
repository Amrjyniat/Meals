package com.example.mealsapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [MealsCategoryDb::class], version = 1)
abstract class MealsDatabase : RoomDatabase() {
    abstract val mealDao: MealCategoryDao

    companion object {

        @Volatile
        private var INSTANCE: MealsDatabase? = null

        fun getDBInstance(mContext: Context): MealsDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        mContext.applicationContext,
                        MealsDatabase::class.java,
                        "meals_categories_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }

                return instance
            }
        }
    }

}