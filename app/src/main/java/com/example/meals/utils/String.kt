package com.example.meals.utils

import com.example.meals.data.network.Constants

fun String.asPreview() = "$this/preview"
fun String.asFullImageUrl() = "${Constants.BASE_URL_INGREDIENT_IMAGE}${this}.png"