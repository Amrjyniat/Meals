package com.example.meals.di

import com.example.meals.data.network.Constants
import com.example.meals.data.network.MealsService
import com.example.meals.data.network.factory.NetworkResultCallAdapterFactory
import com.example.meals.data.network.factory.TagsAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideMealsService(
        retrofitBuilder: Retrofit.Builder,
        okHttpClientBuilder: OkHttpClient.Builder
    ): MealsService = retrofitBuilder
        .client(okHttpClientBuilder.build())
        .baseUrl(Constants.BASE_URL)
        .build()
        .create(MealsService::class.java)

    @Singleton
    @Provides
    fun provideRetrofitBuilder(moshi: Moshi): Retrofit.Builder = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .addCallAdapterFactory(NetworkResultCallAdapterFactory.create())

    @Singleton
    @Provides
    fun provideOkHttpBuilder(): OkHttpClient.Builder {
        val httpLogIntercept = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        return OkHttpClient
            .Builder()
            .addNetworkInterceptor(httpLogIntercept)
    }

    @Singleton
    @Provides
    fun provideMoshi(): Moshi = Moshi.Builder()
        .add(TagsAdapter())
        .addLast(KotlinJsonAdapterFactory()).build()

}