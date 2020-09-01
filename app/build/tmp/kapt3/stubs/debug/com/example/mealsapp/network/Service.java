package com.example.mealsapp.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\'\u00a8\u0006\t"}, d2 = {"Lcom/example/mealsapp/network/Service;", "", "getListMealsAsync", "Lkotlinx/coroutines/Deferred;", "Lcom/example/mealsapp/modules/responses/ResponseMeal;", "nameCategory", "", "getMealsCategoriesAsync", "Lcom/example/mealsapp/modules/responses/ResponseMeals;", "app_debug"})
public abstract interface Service {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "categories.php")
    public abstract kotlinx.coroutines.Deferred<com.example.mealsapp.modules.responses.ResponseMeals> getMealsCategoriesAsync();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "filter.php")
    public abstract kotlinx.coroutines.Deferred<com.example.mealsapp.modules.responses.ResponseMeal> getListMealsAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "c")
    java.lang.String nameCategory);
}