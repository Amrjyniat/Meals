package com.example.meals.ui.base

import androidx.recyclerview.widget.DiffUtil

class GenericDiffUtil<T : Listable> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: T, newItem: T) =
        oldItem == newItem
}

interface Listable {
    val id: Int

    override fun equals(other: Any?): Boolean
}