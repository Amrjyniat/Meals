package com.example.mealsapp.ui.main

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.mealsapp.R
import kotlin.Int
import kotlin.String

class HomeMealsFragmentDirections private constructor() {
  private data class ActionHomeMealsFragmentToListMealsCategoryFragment(
    val idCategory: String
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_homeMealsFragment_to_listMealsCategoryFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("idCategory", this.idCategory)
      return result
    }
  }

  companion object {
    fun actionHomeMealsFragmentToListMealsCategoryFragment(idCategory: String): NavDirections =
        ActionHomeMealsFragmentToListMealsCategoryFragment(idCategory)
  }
}
