package com.example.meals.ui.meals

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.doOnPreDraw
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.meals.data.network.onSuccess
import com.example.meals.databinding.FragmentMealsBinding
import com.example.meals.utils.bindLoading
import com.example.meals.utils.launchAndRepeatInLifecycle
import com.google.android.material.transition.MaterialElevationScale
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.filterIsInstance

@AndroidEntryPoint
class MealsFragment : Fragment() {

    private lateinit var binding: FragmentMealsBinding
    private val viewModel: MealsViewModel by viewModels()

    private val mealsAdapter = MealsAdapter { mealName, extras ->
        viewModel.sendEvent(
            MealsEvent.NavigateToMealDetails(mealName, extras)
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMealsBinding.inflate(inflater, container, false)

        binding.rvMeals.adapter = mealsAdapter

        viewModel.meals.launchAndRepeatInLifecycle(viewLifecycleOwner) { result ->
            binding.itemLoading.bindLoading(result) {
                viewModel.sendEvent(MealsEvent.LoadMeals)
            }
            result.onSuccess { meals ->
                mealsAdapter.submitList(meals)
            }
        }

        viewModel.event.filterIsInstance<MealsEvent.NavigateToMealDetails>()
            .launchAndRepeatInLifecycle(viewLifecycleOwner) { event ->
                exitTransition = MaterialElevationScale(false).apply {
                    duration =
                        resources.getInteger(android.R.integer.config_mediumAnimTime).toLong()
                }
                reenterTransition = MaterialElevationScale(true).apply {
                    duration =
                        resources.getInteger(android.R.integer.config_mediumAnimTime).toLong()
                }
                findNavController().navigate(
                    MealsFragmentDirections.goToDetails(event.mealName),
                    event.extras
                )
            }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        postponeEnterTransition()
        view.doOnPreDraw { startPostponedEnterTransition() }
    }

}