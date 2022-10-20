package com.example.meals.domain.model

import com.example.meals.ui.base.Listable

data class Meal(
    override val id: Int,
    val name: String,
    val image: String,
    val ingredients: List<Ingredient>,
    val tags: List<String>?,
    val instructions: String?
) : Listable