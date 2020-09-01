package com.example.mealsapp.network

import com.example.mealsapp.modules.responses.ResponseMeal
import com.example.mealsapp.modules.responses.ResponseMeals
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {
    @GET("categories.php")
    fun getMealsCategoriesAsync() : Deferred<ResponseMeals>

    @GET("filter.php")
    fun getListMealsAsync(@Query("c") nameCategory: String) : Deferred<ResponseMeal>
}

private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
val interceptor = OkHttpClient.Builder().addInterceptor(HttpLoggingInterceptor()).build()

object Network{
    private const val BASE_URL = "https://themealdb.com/api/json/v1/1/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(interceptor)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

    val mealService = retrofit.create(Service::class.java)
}