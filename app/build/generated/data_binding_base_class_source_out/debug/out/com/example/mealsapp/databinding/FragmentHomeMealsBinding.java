// Generated by data binding compiler. Do not edit!
package com.example.mealsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mealsapp.R;
import com.example.mealsapp.ui.viewModel.HomeMealsCategoryViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentHomeMealsBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView recyclerMealsCategory;

  @Bindable
  protected HomeMealsCategoryViewModel mViewModelBinding;

  protected FragmentHomeMealsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView recyclerMealsCategory) {
    super(_bindingComponent, _root, _localFieldCount);
    this.recyclerMealsCategory = recyclerMealsCategory;
  }

  public abstract void setViewModelBinding(@Nullable HomeMealsCategoryViewModel viewModelBinding);

  @Nullable
  public HomeMealsCategoryViewModel getViewModelBinding() {
    return mViewModelBinding;
  }

  @NonNull
  public static FragmentHomeMealsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home_meals, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeMealsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeMealsBinding>inflateInternal(inflater, R.layout.fragment_home_meals, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeMealsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home_meals, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeMealsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeMealsBinding>inflateInternal(inflater, R.layout.fragment_home_meals, null, false, component);
  }

  public static FragmentHomeMealsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentHomeMealsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomeMealsBinding)bind(component, view, R.layout.fragment_home_meals);
  }
}
