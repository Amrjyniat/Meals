package com.example.mealsapp.databinding;
import com.example.mealsapp.R;
import com.example.mealsapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemListMealCategoryBindingImpl extends ItemListMealCategoryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemListMealCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemListMealCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.itemImageMeal.setTag(null);
        this.itemTextMealName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mealApi == variableId) {
            setMealApi((com.example.mealsapp.modules.MealApi) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMealApi(@Nullable com.example.mealsapp.modules.MealApi MealApi) {
        this.mMealApi = MealApi;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mealApi);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.mealsapp.modules.MealApi mealApi = mMealApi;
        java.lang.String mealApiNameMeal = null;
        java.lang.String mealApiImageUrlMeal = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (mealApi != null) {
                    // read mealApi.nameMeal
                    mealApiNameMeal = mealApi.getNameMeal();
                    // read mealApi.imageUrlMeal
                    mealApiImageUrlMeal = mealApi.getImageUrlMeal();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.mealsapp.utils.BindingAdaptersKt.setImageCategory(this.itemImageMeal, mealApiImageUrlMeal);
            com.example.mealsapp.utils.BindingAdaptersKt.setNameCategory(this.itemTextMealName, mealApiNameMeal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mealApi
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}