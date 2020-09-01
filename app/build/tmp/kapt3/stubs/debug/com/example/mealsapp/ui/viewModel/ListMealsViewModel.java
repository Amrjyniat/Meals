package com.example.mealsapp.ui.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0017\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0018H\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/mealsapp/ui/viewModel/ListMealsViewModel;", "Landroidx/lifecycle/ViewModel;", "idCategory", "", "(Ljava/lang/String;)V", "_listMeals", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/mealsapp/modules/MealApi;", "_status", "Lcom/example/mealsapp/ui/viewModel/StatusConnection;", "coroutineJob", "Lkotlinx/coroutines/CompletableJob;", "getIdCategory", "()Ljava/lang/String;", "listMeals", "Landroidx/lifecycle/LiveData;", "getListMeals", "()Landroidx/lifecycle/LiveData;", "status", "getStatus", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "initialized", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "app_debug"})
public final class ListMealsViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.CompletableJob coroutineJob = null;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private androidx.lifecycle.MutableLiveData<com.example.mealsapp.ui.viewModel.StatusConnection> _status;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.mealsapp.modules.MealApi>> _listMeals;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idCategory = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.mealsapp.ui.viewModel.StatusConnection> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mealsapp.modules.MealApi>> getListMeals() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdCategory() {
        return null;
    }
    
    public ListMealsViewModel(@org.jetbrains.annotations.NotNull()
    java.lang.String idCategory) {
        super();
    }
}