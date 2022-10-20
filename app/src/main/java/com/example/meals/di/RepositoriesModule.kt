package com.example.meals.di

import com.example.meals.data.network.MealsService
import com.example.meals.domain.repo.MainRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoriesModule {

    @Provides
    @Singleton
    fun provideMainRepo(service: MealsService) = MainRepositoryImpl(service)

}