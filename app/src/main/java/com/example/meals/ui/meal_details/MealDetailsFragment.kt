package com.example.meals.ui.meal_details

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import coil.load
import com.example.meals.R
import com.example.meals.data.network.onSuccess
import com.example.meals.databinding.FragmentMealDetailsBinding
import com.example.meals.domain.model.Meal
import com.example.meals.utils.applySpannable
import com.example.meals.utils.bindLoading
import com.example.meals.utils.launchAndRepeatInLifecycle
import com.google.android.material.chip.Chip
import com.google.android.material.transition.MaterialContainerTransform
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MealDetailsFragment : Fragment() {

    private lateinit var binding: FragmentMealDetailsBinding
    private val viewModel: MealDetailsViewModel by viewModels()

    private val ingredientAdapter = IngredientAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedElementEnterTransition = MaterialContainerTransform().apply {
            drawingViewId = R.id.nav_host
            duration = resources.getInteger(android.R.integer.config_mediumAnimTime).toLong()
            scrimColor = Color.TRANSPARENT
            setAllContainerColors(ContextCompat.getColor(requireContext(), R.color.white))
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMealDetailsBinding.inflate(inflater, container, false)
        binding.rvIngredient.adapter = ingredientAdapter

        viewModel.mealDetails.launchAndRepeatInLifecycle(viewLifecycleOwner) { result ->
            binding.itemLoading.bindLoading(result) {
                //todo
            }
            result.onSuccess { meal -> onDataReady(meal) }
        }

        return binding.root
    }

    private fun onDataReady(meal: Meal) {
        binding.apply {
            imgMeal.load(meal.image) {
                allowHardware(false)
                placeholder(R.drawable.ic_placeholder)
                error(R.drawable.ic_error)
                crossfade(true)
            }

            tvName.text = meal.name

            tvInstruction.text =
                getString(R.string.instructions_dynamic, meal.instructions)
            tvInstruction.applySpannable(
                getString(R.string.instructions_dynamic, ""), R.color.black
            )

            chipGroupTags.removeAllViews()
            meal.tags?.forEachIndexed { index, tag ->
                val chip = Chip(requireContext()).apply {
                    id = index
                    text = tag
                    setChipBackgroundColorResource(R.color.purple_500)
                    setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
                }
                chipGroupTags.addView(chip)
            }

            binding.tvIngredient.isVisible = meal.ingredients.isNotEmpty()
            ingredientAdapter.submitList(meal.ingredients)
        }
    }
}