package com.example.mealsapp.ui.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u000e*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/mealsapp/ui/viewModel/HomeMealsCategoryViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_mealCategoryNavigate", "Landroidx/lifecycle/MutableLiveData;", "", "database", "Lcom/example/mealsapp/database/MealsDatabase;", "listMeals", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/mealsapp/modules/MealCategory;", "kotlin.jvm.PlatformType", "getListMeals", "()Landroidx/lifecycle/LiveData;", "mealCategoryApiNavigate", "getMealCategoryApiNavigate", "repository", "Lcom/example/mealsapp/repositories/MealsCategoryRepository;", "doneNavigateToMealCategory", "", "onMealCategoryClicked", "idCategory", "Factory", "app_debug"})
public final class HomeMealsCategoryViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.mealsapp.database.MealsDatabase database = null;
    private final com.example.mealsapp.repositories.MealsCategoryRepository repository = null;
    private androidx.lifecycle.MutableLiveData<java.lang.String> _mealCategoryNavigate;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.mealsapp.modules.MealCategory>> listMeals = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getMealCategoryApiNavigate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mealsapp.modules.MealCategory>> getListMeals() {
        return null;
    }
    
    public final void onMealCategoryClicked(@org.jetbrains.annotations.NotNull()
    java.lang.String idCategory) {
    }
    
    public final void doneNavigateToMealCategory() {
    }
    
    public HomeMealsCategoryViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    /**
     * Factory for constructing DevByteViewModel with parameter
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/mealsapp/ui/viewModel/HomeMealsCategoryViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApp", "()Landroid/app/Application;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull()
        private final android.app.Application app = null;
        
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Application getApp() {
            return null;
        }
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.app.Application app) {
            super();
        }
    }
}