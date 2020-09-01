package com.example.mealsapp.utils

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.airbnb.lottie.LottieAnimationView
import com.bumptech.glide.Glide
import com.example.mealsapp.R
import com.example.mealsapp.ui.viewModel.StatusConnection

@BindingAdapter("mealCategoryName")
fun setNameCategory(txtView: TextView, mTxt: String?){
    mTxt?.let {
        txtView.text = mTxt
    }
}

@BindingAdapter("mealCategoryImageUrl")
fun setImageCategory(imageView: ImageView, imageUrl: String?){
    imageUrl?.let {
        Glide.with(imageView)
            .load(imageUrl)
            .placeholder(R.drawable.ic_baseline_fireplace_24)
            .error(R.drawable.ic_baseline_error_24)
            .into(imageView);
    }
}

@BindingAdapter("statusConnection")
fun getStatusConnection(animationStatus: LottieAnimationView, statusConn: StatusConnection?){
    when(statusConn){
        StatusConnection.LOADING ->{
            animationStatus.visibility = View.VISIBLE
            animationStatus.setAnimation(R.raw.connection_load)
            animationStatus.playAnimation()
        }
        StatusConnection.FAILURE ->{
            animationStatus.visibility = View.VISIBLE
            animationStatus.setAnimation(R.raw.connection_error)
            animationStatus.playAnimation()
        }
        StatusConnection.DONE ->{
            animationStatus.visibility = View.GONE
            animationStatus.cancelAnimation()
        }


    }
}