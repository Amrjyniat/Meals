package com.example.meals.domain.model

import com.example.meals.ui.base.Listable

data class Ingredient(
    override val id: Int,
    val name: String,
    val image: String
): Listable