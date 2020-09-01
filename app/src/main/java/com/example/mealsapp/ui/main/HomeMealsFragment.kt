package com.example.mealsapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mealsapp.R
import com.example.mealsapp.databinding.FragmentHomeMealsBinding
import com.example.mealsapp.ui.adapters.MealCategoryClickListener
import com.example.mealsapp.ui.adapters.MealsAdapter
import com.example.mealsapp.ui.viewModel.HomeMealsCategoryViewModel

class HomeMealsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentHomeMealsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home_meals, container, false)

        val recyclerView = binding.recyclerMealsCategory
        val activity = requireNotNull(this.activity)

        val viewModel = ViewModelProvider(this,HomeMealsCategoryViewModel.Factory(activity.application))
            .get(HomeMealsCategoryViewModel::class.java)

        binding.lifecycleOwner = this
        binding.viewModelBinding = viewModel

        val mealsCategoryAdapter = MealsAdapter(MealCategoryClickListener { idCategory ->
            viewModel.onMealCategoryClicked(idCategory)
        })

        viewModel.mealCategoryApiNavigate.observe(viewLifecycleOwner, Observer { mealCategory ->
            mealCategory?.let {
                this.findNavController().navigate(
                    HomeMealsFragmentDirections.actionHomeMealsFragmentToListMealsCategoryFragment(mealCategory)
                )
                viewModel.doneNavigateToMealCategory()
            }
        })

        viewModel.listMeals.observe(viewLifecycleOwner, Observer { listMeals ->
            mealsCategoryAdapter.submitList(listMeals)
        })

        recyclerView.adapter = mealsCategoryAdapter

        return binding.root
    }

}