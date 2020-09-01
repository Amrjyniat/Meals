package com.example.mealsapp.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR+\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/mealsapp/repositories/MealsCategoryRepository;", "", "mealsDatabase", "Lcom/example/mealsapp/database/MealsDatabase;", "(Lcom/example/mealsapp/database/MealsDatabase;)V", "listMeals", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/mealsapp/modules/MealCategory;", "kotlin.jvm.PlatformType", "getListMeals", "()Landroidx/lifecycle/LiveData;", "refreshMealsCategory", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MealsCategoryRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.mealsapp.modules.MealCategory>> listMeals = null;
    private final com.example.mealsapp.database.MealsDatabase mealsDatabase = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refreshMealsCategory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mealsapp.modules.MealCategory>> getListMeals() {
        return null;
    }
    
    public MealsCategoryRepository(@org.jetbrains.annotations.NotNull()
    com.example.mealsapp.database.MealsDatabase mealsDatabase) {
        super();
    }
}