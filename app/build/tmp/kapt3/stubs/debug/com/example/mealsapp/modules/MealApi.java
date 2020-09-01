package com.example.mealsapp.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/example/mealsapp/modules/MealApi;", "", "nameMeal", "", "imageUrlMeal", "idMeal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdMeal", "()Ljava/lang/String;", "getImageUrlMeal", "getNameMeal", "app_debug"})
public final class MealApi {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameMeal = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String imageUrlMeal = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idMeal = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameMeal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageUrlMeal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdMeal() {
        return null;
    }
    
    public MealApi(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "strMeal")
    java.lang.String nameMeal, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "strMealThumb")
    java.lang.String imageUrlMeal, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "idMeal")
    java.lang.String idMeal) {
        super();
    }
}