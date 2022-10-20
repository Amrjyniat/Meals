package com.example.meals.utils

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.meals.data.network.ApiLoading
import com.example.meals.data.network.ApiResult
import com.example.meals.data.network.ApiSuccess
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

fun <T> Flow<T>.myStateIn(
    scope: CoroutineScope,
    initialValue: T,
    started: SharingStarted = SharingStarted.WhileSubscribed(5000)
) = stateIn(scope, started, initialValue)

fun <T> Flow<T>.myShareIn(
    scope: CoroutineScope,
    started: SharingStarted = SharingStarted.Lazily,
    replay: Int = 0
): SharedFlow<T> = shareIn(scope, started, replay)

inline fun <T> Flow<T>.launchAndRepeatInLifecycle(
    lifecycle: LifecycleOwner,
    state: Lifecycle.State = Lifecycle.State.STARTED,
    crossinline result: suspend (T) -> Unit
) {
    lifecycle.lifecycleScope.launch {
        lifecycle.repeatOnLifecycle(state) {
            collectLatest { result(it) }
        }
    }
}

fun <T : Any> loadingResultFlow(
    result: suspend () -> ApiResult<T>
) = flow {
    emit(ApiLoading())
    emit(result())
}

fun <T : Any> resultFlow(
    result: suspend () -> ApiResult<T>
) = flow {
    emit(result())
}
