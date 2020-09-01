package com.example.mealsapp.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mealsapp.databinding.ItemCategoryMealBinding
import com.example.mealsapp.modules.MealCategory

class MealsAdapter(private val clickListener: MealCategoryClickListener) : ListAdapter<MealCategory, MealsAdapter.MealCategoryViewHolder>(DiffMealsCategory()) {

    class MealCategoryViewHolder(private val binding: ItemCategoryMealBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MealCategory, clickListener: MealCategoryClickListener) {
           binding.clickListenerBinding = clickListener
           binding.mealCategory = item
           binding.executePendingBindings()
        }

        companion object{
            fun from(parent: ViewGroup) : MealCategoryViewHolder{
                val layout = LayoutInflater.from(parent.context)
                val holder = ItemCategoryMealBinding.inflate(layout, parent,false)
                return MealCategoryViewHolder(holder)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealCategoryViewHolder {
        return MealCategoryViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MealCategoryViewHolder, position: Int) {
        holder.bind(getItem(position), clickListener)
    }
}

class DiffMealsCategory(): DiffUtil.ItemCallback<MealCategory>(){
    override fun areItemsTheSame(oldItem: MealCategory, newItem: MealCategory): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: MealCategory, newItem: MealCategory): Boolean {
        return oldItem.idCategory == newItem.idCategory
    }
}

class MealCategoryClickListener(val clickListener: (idCategory: String) -> Unit){
    fun onClick(idCategory: String) = clickListener(idCategory)
}