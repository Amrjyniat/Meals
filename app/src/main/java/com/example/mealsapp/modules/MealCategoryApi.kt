package com.example.mealsapp.modules

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MealCategoryApi(
    @Json(name = "idCategory")
    val idCategory: String,

    @Json(name = "strCategory")
    val nameCategory: String,

    @Json(name = "strCategoryThumb")
    val imageCategoryUrl: String,

    @Json(name = "strCategoryDescription")
    val descCategory: String
) : Parcelable
