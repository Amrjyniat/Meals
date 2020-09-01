package com.example.mealsapp.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/example/mealsapp/ui/adapters/ListMealAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/mealsapp/modules/MealApi;", "Lcom/example/mealsapp/ui/adapters/ListMealAdapter$MealViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MealViewHolder", "app_debug"})
public final class ListMealAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.mealsapp.modules.MealApi, com.example.mealsapp.ui.adapters.ListMealAdapter.MealViewHolder> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.mealsapp.ui.adapters.ListMealAdapter.MealViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mealsapp.ui.adapters.ListMealAdapter.MealViewHolder holder, int position) {
    }
    
    public ListMealAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/mealsapp/ui/adapters/ListMealAdapter$MealViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/mealsapp/databinding/ItemListMealCategoryBinding;", "(Lcom/example/mealsapp/databinding/ItemListMealCategoryBinding;)V", "bind", "", "item", "Lcom/example/mealsapp/modules/MealApi;", "Companion", "app_debug"})
    public static final class MealViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.example.mealsapp.databinding.ItemListMealCategoryBinding binding;
        public static final com.example.mealsapp.ui.adapters.ListMealAdapter.MealViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        com.example.mealsapp.modules.MealApi item) {
        }
        
        public MealViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.mealsapp.databinding.ItemListMealCategoryBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/mealsapp/ui/adapters/ListMealAdapter$MealViewHolder$Companion;", "", "()V", "from", "Lcom/example/mealsapp/ui/adapters/ListMealAdapter$MealViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.mealsapp.ui.adapters.ListMealAdapter.MealViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}