package com.example.mealsapp.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mealsapp.databinding.ItemListMealCategoryBinding
import com.example.mealsapp.modules.MealApi

class ListMealAdapter : ListAdapter<MealApi, ListMealAdapter.MealViewHolder>(DiffMeal()) {
    class MealViewHolder(private var binding: ItemListMealCategoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MealApi?) {
            binding.mealApi = item
            binding.executePendingBindings()
        }

        companion object{
            fun from(parent: ViewGroup): MealViewHolder{
                val layout = LayoutInflater.from(parent.context)
                val inflater = ItemListMealCategoryBinding.inflate(layout, parent, false)
                return MealViewHolder(inflater)
            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealViewHolder {
        return MealViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MealViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}

class DiffMeal() : DiffUtil.ItemCallback<MealApi>(){
    override fun areItemsTheSame(oldItem: MealApi, newItem: MealApi): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: MealApi, newItem: MealApi): Boolean {
        return oldItem.idMeal == newItem.idMeal
    }

}