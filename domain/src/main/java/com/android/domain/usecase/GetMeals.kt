package com.android.domain.usecase

import com.android.domain.repo.MealsRepo

class GetMeals(private val mealsRepo: MealsRepo) {

    suspend operator fun invoke() = mealsRepo.getMealsFromRemote()
}