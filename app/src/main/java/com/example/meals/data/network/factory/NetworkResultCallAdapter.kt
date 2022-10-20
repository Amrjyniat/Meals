package com.example.meals.data.network.factory

import com.example.meals.data.network.ApiResult

import retrofit2.Call
import retrofit2.CallAdapter
import java.lang.reflect.Type

class NetworkResultCallAdapter(
    private val resultType: Type
) : CallAdapter<Type, Call<ApiResult<Type>>> {

    override fun responseType() = resultType

    override fun adapt(call: Call<Type>): Call<ApiResult<Type>> {
        return NetworkResultCall(call)
    }
}