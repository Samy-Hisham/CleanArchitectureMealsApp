package com.android.data.repo

import com.android.data.remote.ApiService
import com.android.domain.model.CategoryResponse
import com.android.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService) : MealsRepo {

    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}