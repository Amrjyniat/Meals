package com.example.mealsapp.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/mealsapp/ui/adapters/MealsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/mealsapp/modules/MealCategory;", "Lcom/example/mealsapp/ui/adapters/MealsAdapter$MealCategoryViewHolder;", "clickListener", "Lcom/example/mealsapp/ui/adapters/MealCategoryClickListener;", "(Lcom/example/mealsapp/ui/adapters/MealCategoryClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MealCategoryViewHolder", "app_debug"})
public final class MealsAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.mealsapp.modules.MealCategory, com.example.mealsapp.ui.adapters.MealsAdapter.MealCategoryViewHolder> {
    private final com.example.mealsapp.ui.adapters.MealCategoryClickListener clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.mealsapp.ui.adapters.MealsAdapter.MealCategoryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mealsapp.ui.adapters.MealsAdapter.MealCategoryViewHolder holder, int position) {
    }
    
    public MealsAdapter(@org.jetbrains.annotations.NotNull()
    com.example.mealsapp.ui.adapters.MealCategoryClickListener clickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/mealsapp/ui/adapters/MealsAdapter$MealCategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/mealsapp/databinding/ItemCategoryMealBinding;", "(Lcom/example/mealsapp/databinding/ItemCategoryMealBinding;)V", "bind", "", "item", "Lcom/example/mealsapp/modules/MealCategory;", "clickListener", "Lcom/example/mealsapp/ui/adapters/MealCategoryClickListener;", "Companion", "app_debug"})
    public static final class MealCategoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.mealsapp.databinding.ItemCategoryMealBinding binding = null;
        public static final com.example.mealsapp.ui.adapters.MealsAdapter.MealCategoryViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.mealsapp.modules.MealCategory item, @org.jetbrains.annotations.NotNull()
        com.example.mealsapp.ui.adapters.MealCategoryClickListener clickListener) {
        }
        
        public MealCategoryViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.mealsapp.databinding.ItemCategoryMealBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/mealsapp/ui/adapters/MealsAdapter$MealCategoryViewHolder$Companion;", "", "()V", "from", "Lcom/example/mealsapp/ui/adapters/MealsAdapter$MealCategoryViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.mealsapp.ui.adapters.MealsAdapter.MealCategoryViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}