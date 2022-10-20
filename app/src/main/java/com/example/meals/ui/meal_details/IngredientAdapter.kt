package com.example.meals.ui.meal_details

import android.view.LayoutInflater
import android.view.ViewGroup
import coil.load
import com.example.meals.R
import com.example.meals.databinding.ItemIngredientBinding
import com.example.meals.domain.model.Ingredient
import com.example.meals.ui.base.BaseListAdapter
import timber.log.Timber

class IngredientAdapter : BaseListAdapter<Ingredient, ItemIngredientBinding>() {
    override fun onHolderCreated(
        layoutInflater: LayoutInflater,
        parent: ViewGroup,
        viewType: Int
    ) = ItemIngredientBinding.inflate(layoutInflater, parent, false)

    override fun ItemIngredientBinding.onDataBound(
        item: Ingredient
    ) {
        tvName.text = item.name
        imgIngredient.load(item.image) {
            allowHardware(false)
            placeholder(R.drawable.ic_placeholder)
            error(R.drawable.ic_error)
            crossfade(true)
        }
    }
}