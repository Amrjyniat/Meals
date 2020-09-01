package com.example.mealsapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.mealsapp.R
import com.example.mealsapp.databinding.FragmentListMealsCategoryBinding
import com.example.mealsapp.ui.adapters.ListMealAdapter
import com.example.mealsapp.ui.viewModel.ListMealsViewModel
import com.example.mealsapp.ui.viewModel.ListMealsViewModelFactory

class ListMealsCategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentListMealsCategoryBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_list_meals_category, container, false
        )

        binding.lifecycleOwner = this

        val recyclerView = binding.recyclerListMealsCategory

        //Create the divider and set it to recyclerview
        val div = DividerItemDecoration(activity, DividerItemDecoration.VERTICAL)
        div.setDrawable(resources.getDrawable(R.drawable.recyclerview_divider))
        recyclerView.addItemDecoration(div)

        val listMealAdapter = ListMealAdapter()

        val mIdCategory = ListMealsCategoryFragmentArgs.fromBundle(requireArguments()).idCategory
        val viewModel = ViewModelProvider(
            this,
            ListMealsViewModelFactory(mIdCategory)
        ).get(ListMealsViewModel::class.java)
        binding.viewModelLayout = viewModel
        viewModel.listMeals.observe(viewLifecycleOwner, Observer { listMeals ->
            listMeals?.let {
                listMealAdapter.submitList(listMeals)
            }
        })

        recyclerView.adapter = listMealAdapter

        return binding.root
    }

}