package com.example.meals.ui.meals

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import coil.load
import com.example.meals.R
import com.example.meals.databinding.ItemMealBinding
import com.example.meals.domain.model.Meal
import com.example.meals.ui.base.BaseListAdapter
import com.example.meals.utils.asPreview

class MealsAdapter(
    private val onMealClick: (name: String, FragmentNavigator.Extras) -> Unit
) : BaseListAdapter<Meal, ItemMealBinding>() {
    override fun onHolderCreated(
        layoutInflater: LayoutInflater,
        parent: ViewGroup,
        viewType: Int
    ) = ItemMealBinding.inflate(layoutInflater, parent, false)

    override fun ItemMealBinding.onDataBound(item: Meal) {
        root.transitionName = item.id.toString()
        tvName.text = item.name
        tvInstruction.text = item.instructions
        imgMeal.load(item.image.asPreview()) {
            allowHardware(false)
            placeholder(R.drawable.ic_placeholder)
            error(R.drawable.ic_error)
            crossfade(true)
        }
        root.setOnClickListener {
            val mealDetailsTransitionName = root.context.getString(R.string.meal_details)
            val extras = FragmentNavigatorExtras(it to mealDetailsTransitionName)
            onMealClick(item.name, extras)
        }
    }
}
