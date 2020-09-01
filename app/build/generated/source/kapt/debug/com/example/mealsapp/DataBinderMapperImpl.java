package com.example.mealsapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.mealsapp.databinding.FragmentHomeMealsBindingImpl;
import com.example.mealsapp.databinding.FragmentListMealsCategoryBindingImpl;
import com.example.mealsapp.databinding.ItemCategoryMealBindingImpl;
import com.example.mealsapp.databinding.ItemListMealCategoryBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTHOMEMEALS = 1;

  private static final int LAYOUT_FRAGMENTLISTMEALSCATEGORY = 2;

  private static final int LAYOUT_ITEMCATEGORYMEAL = 3;

  private static final int LAYOUT_ITEMLISTMEALCATEGORY = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.mealsapp.R.layout.fragment_home_meals, LAYOUT_FRAGMENTHOMEMEALS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.mealsapp.R.layout.fragment_list_meals_category, LAYOUT_FRAGMENTLISTMEALSCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.mealsapp.R.layout.item_category_meal, LAYOUT_ITEMCATEGORYMEAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.mealsapp.R.layout.item_list_meal_category, LAYOUT_ITEMLISTMEALCATEGORY);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTHOMEMEALS: {
          if ("layout/fragment_home_meals_0".equals(tag)) {
            return new FragmentHomeMealsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home_meals is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLISTMEALSCATEGORY: {
          if ("layout/fragment_list_meals_category_0".equals(tag)) {
            return new FragmentListMealsCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_list_meals_category is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCATEGORYMEAL: {
          if ("layout/item_category_meal_0".equals(tag)) {
            return new ItemCategoryMealBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_category_meal is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLISTMEALCATEGORY: {
          if ("layout/item_list_meal_category_0".equals(tag)) {
            return new ItemListMealCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_list_meal_category is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "clickListenerBinding");
      sKeys.put(2, "mealApi");
      sKeys.put(3, "mealCategory");
      sKeys.put(4, "viewModelBinding");
      sKeys.put(5, "viewModelLayout");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/fragment_home_meals_0", com.example.mealsapp.R.layout.fragment_home_meals);
      sKeys.put("layout/fragment_list_meals_category_0", com.example.mealsapp.R.layout.fragment_list_meals_category);
      sKeys.put("layout/item_category_meal_0", com.example.mealsapp.R.layout.item_category_meal);
      sKeys.put("layout/item_list_meal_category_0", com.example.mealsapp.R.layout.item_list_meal_category);
    }
  }
}
