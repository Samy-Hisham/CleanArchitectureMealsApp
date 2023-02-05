package com.android.domain.repo

import com.android.domain.model.CategoryResponse

interface MealsRepo {

    suspend fun getMealsFromRemote(): CategoryResponse
}