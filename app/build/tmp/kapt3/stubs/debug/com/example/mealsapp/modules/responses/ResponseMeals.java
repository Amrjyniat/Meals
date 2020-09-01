package com.example.mealsapp.modules.responses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/mealsapp/modules/responses/ResponseMeals;", "", "categoriesMealApis", "", "Lcom/example/mealsapp/modules/MealCategoryApi;", "(Ljava/util/List;)V", "getCategoriesMealApis", "()Ljava/util/List;", "app_debug"})
public final class ResponseMeals {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.mealsapp.modules.MealCategoryApi> categoriesMealApis = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.mealsapp.modules.MealCategoryApi> getCategoriesMealApis() {
        return null;
    }
    
    public ResponseMeals(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "categories")
    java.util.List<com.example.mealsapp.modules.MealCategoryApi> categoriesMealApis) {
        super();
    }
}