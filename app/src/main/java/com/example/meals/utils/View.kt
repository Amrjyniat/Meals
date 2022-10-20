package com.example.meals.utils

import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.AbsoluteSizeSpan
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.example.meals.data.network.ApiError
import com.example.meals.data.network.ApiLoading
import com.example.meals.data.network.ApiResult
import com.example.meals.data.network.ApiSuccess
import com.example.meals.databinding.ItemLoadingBinding

@JvmName("bindLoadingList")
fun <T> ItemLoadingBinding.bindLoading(
    result: ApiResult<List<T>>,
    onRetry: () -> Unit
) {
    root.isVisible = result !is ApiSuccess || result.data.isEmpty()

    progress.isVisible = result is ApiLoading
    tvError.isVisible = result is ApiError
    if (result is ApiError) tvError.text = result.message
    tvNoData.isVisible = result is ApiSuccess && result.data.isEmpty()
    btnRetry.isVisible = result is ApiError
    btnRetry.setOnClickListener { onRetry() }
}

fun <T> ItemLoadingBinding.bindLoading(
    result: ApiResult<T>,
    onRetry: () -> Unit
) {
    root.isVisible = result !is ApiSuccess
    progress.isVisible = result is ApiLoading
    tvError.isVisible = result is ApiError
    if (result is ApiError) tvError.text = result.message
    btnRetry.isVisible = result is ApiError
    btnRetry.setOnClickListener { onRetry() }
}

fun TextView.applySpannable(
    spannableText: String,
    @ColorRes spannableColor: Int
) {
    val originalText = text.toString()
    val spannableString = SpannableStringBuilder(originalText)
    if (originalText.contains(spannableText)) {
        val foregroundSpan = ForegroundColorSpan(ContextCompat.getColor(context, spannableColor))
        val startIdx = originalText.indexOf(spannableText)
        val endIdx = startIdx + spannableText.length - 1
        spannableString.setSpan(
            foregroundSpan,
            startIdx,
            endIdx,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannableString.setSpan(
            AbsoluteSizeSpan(20, true),
            startIdx,
            endIdx,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
    }
    text = spannableString
}