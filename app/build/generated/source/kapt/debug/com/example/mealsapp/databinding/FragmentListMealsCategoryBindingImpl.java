package com.example.mealsapp.databinding;
import com.example.mealsapp.R;
import com.example.mealsapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentListMealsCategoryBindingImpl extends FragmentListMealsCategoryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recycler_list_meals_category, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentListMealsCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentListMealsCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.airbnb.lottie.LottieAnimationView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.lottieStatusConnAnimationListMeals.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.viewModelLayout == variableId) {
            setViewModelLayout((com.example.mealsapp.ui.viewModel.ListMealsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModelLayout(@Nullable com.example.mealsapp.ui.viewModel.ListMealsViewModel ViewModelLayout) {
        this.mViewModelLayout = ViewModelLayout;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModelLayout);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLayoutStatus((androidx.lifecycle.LiveData<com.example.mealsapp.ui.viewModel.StatusConnection>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLayoutStatus(androidx.lifecycle.LiveData<com.example.mealsapp.ui.viewModel.StatusConnection> ViewModelLayoutStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        androidx.lifecycle.LiveData<com.example.mealsapp.ui.viewModel.StatusConnection> viewModelLayoutStatus = null;
        com.example.mealsapp.ui.viewModel.ListMealsViewModel viewModelLayout = mViewModelLayout;
        com.example.mealsapp.ui.viewModel.StatusConnection viewModelLayoutStatusGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModelLayout != null) {
                    // read viewModelLayout.status
                    viewModelLayoutStatus = viewModelLayout.getStatus();
                }
                updateLiveDataRegistration(0, viewModelLayoutStatus);


                if (viewModelLayoutStatus != null) {
                    // read viewModelLayout.status.getValue()
                    viewModelLayoutStatusGetValue = viewModelLayoutStatus.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.mealsapp.utils.BindingAdaptersKt.getStatusConnection(this.lottieStatusConnAnimationListMeals, viewModelLayoutStatusGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModelLayout.status
        flag 1 (0x2L): viewModelLayout
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}