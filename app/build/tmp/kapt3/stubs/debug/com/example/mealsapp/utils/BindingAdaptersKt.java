package com.example.mealsapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u001a\u001a\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0007\u00a8\u0006\u000f"}, d2 = {"getStatusConnection", "", "animationStatus", "Lcom/airbnb/lottie/LottieAnimationView;", "statusConn", "Lcom/example/mealsapp/ui/viewModel/StatusConnection;", "setImageCategory", "imageView", "Landroid/widget/ImageView;", "imageUrl", "", "setNameCategory", "txtView", "Landroid/widget/TextView;", "mTxt", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"mealCategoryName"})
    public static final void setNameCategory(@org.jetbrains.annotations.NotNull()
    android.widget.TextView txtView, @org.jetbrains.annotations.Nullable()
    java.lang.String mTxt) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"mealCategoryImageUrl"})
    public static final void setImageCategory(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"statusConnection"})
    public static final void getStatusConnection(@org.jetbrains.annotations.NotNull()
    com.airbnb.lottie.LottieAnimationView animationStatus, @org.jetbrains.annotations.Nullable()
    com.example.mealsapp.ui.viewModel.StatusConnection statusConn) {
    }
}