package com.example.mealsapp.modules

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class MealCategory(
    val idCategory: String,
    val nameCategory: String,
    val imageCategoryUrl: String,
    val descCategory: String
) : Parcelable
