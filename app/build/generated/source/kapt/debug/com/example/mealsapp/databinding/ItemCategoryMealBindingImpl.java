package com.example.mealsapp.databinding;
import com.example.mealsapp.R;
import com.example.mealsapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCategoryMealBindingImpl extends ItemCategoryMealBinding implements com.example.mealsapp.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCategoryMealBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemCategoryMealBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.descItemCategory.setTag(null);
        this.imageItemCategory.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nameItemCategory.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.mealsapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.clickListenerBinding == variableId) {
            setClickListenerBinding((com.example.mealsapp.ui.adapters.MealCategoryClickListener) variable);
        }
        else if (BR.mealCategory == variableId) {
            setMealCategory((com.example.mealsapp.modules.MealCategory) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListenerBinding(@Nullable com.example.mealsapp.ui.adapters.MealCategoryClickListener ClickListenerBinding) {
        this.mClickListenerBinding = ClickListenerBinding;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListenerBinding);
        super.requestRebind();
    }
    public void setMealCategory(@Nullable com.example.mealsapp.modules.MealCategory MealCategory) {
        this.mMealCategory = MealCategory;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.mealCategory);
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
        java.lang.String mealCategoryNameCategory = null;
        java.lang.String mealCategoryImageCategoryUrl = null;
        java.lang.String mealCategoryDescCategory = null;
        com.example.mealsapp.ui.adapters.MealCategoryClickListener clickListenerBinding = mClickListenerBinding;
        com.example.mealsapp.modules.MealCategory mealCategory = mMealCategory;

        if ((dirtyFlags & 0x6L) != 0) {



                if (mealCategory != null) {
                    // read mealCategory.nameCategory
                    mealCategoryNameCategory = mealCategory.getNameCategory();
                    // read mealCategory.imageCategoryUrl
                    mealCategoryImageCategoryUrl = mealCategory.getImageCategoryUrl();
                    // read mealCategory.descCategory
                    mealCategoryDescCategory = mealCategory.getDescCategory();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.example.mealsapp.utils.BindingAdaptersKt.setNameCategory(this.descItemCategory, mealCategoryDescCategory);
            com.example.mealsapp.utils.BindingAdaptersKt.setImageCategory(this.imageItemCategory, mealCategoryImageCategoryUrl);
            com.example.mealsapp.utils.BindingAdaptersKt.setNameCategory(this.nameItemCategory, mealCategoryNameCategory);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // mealCategory != null
        boolean mealCategoryJavaLangObjectNull = false;
        // mealCategory.nameCategory
        java.lang.String mealCategoryNameCategory = null;
        // clickListenerBinding != null
        boolean clickListenerBindingJavaLangObjectNull = false;
        // clickListenerBinding
        com.example.mealsapp.ui.adapters.MealCategoryClickListener clickListenerBinding = mClickListenerBinding;
        // mealCategory
        com.example.mealsapp.modules.MealCategory mealCategory = mMealCategory;



        clickListenerBindingJavaLangObjectNull = (clickListenerBinding) != (null);
        if (clickListenerBindingJavaLangObjectNull) {



            mealCategoryJavaLangObjectNull = (mealCategory) != (null);
            if (mealCategoryJavaLangObjectNull) {


                mealCategoryNameCategory = mealCategory.getNameCategory();

                clickListenerBinding.onClick(mealCategoryNameCategory);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListenerBinding
        flag 1 (0x2L): mealCategory
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}