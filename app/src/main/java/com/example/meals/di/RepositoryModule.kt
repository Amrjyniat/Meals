package com.example.meals.di

import com.example.meals.data.repository.MainRepository
import com.example.meals.data.repository.RemoteMainRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    @RemoteRepository
    fun remoteMainRepository(remoteMainRepository: RemoteMainRepository): MainRepository

}

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class RemoteRepository