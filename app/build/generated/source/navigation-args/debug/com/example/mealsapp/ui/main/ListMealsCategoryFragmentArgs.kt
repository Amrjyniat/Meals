package com.example.mealsapp.ui.main

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class ListMealsCategoryFragmentArgs(
  val idCategory: String
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("idCategory", this.idCategory)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): ListMealsCategoryFragmentArgs {
      bundle.setClassLoader(ListMealsCategoryFragmentArgs::class.java.classLoader)
      val __idCategory : String?
      if (bundle.containsKey("idCategory")) {
        __idCategory = bundle.getString("idCategory")
        if (__idCategory == null) {
          throw IllegalArgumentException("Argument \"idCategory\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"idCategory\" is missing and does not have an android:defaultValue")
      }
      return ListMealsCategoryFragmentArgs(__idCategory)
    }
  }
}
