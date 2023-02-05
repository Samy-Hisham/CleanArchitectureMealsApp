package com.android.meals.di

import com.android.data.remote.ApiService
import com.android.data.repo.MealsRepoImpl
import com.android.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService): MealsRepo{
        return MealsRepoImpl(apiService)
    }
}