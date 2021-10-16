package com.example.domain.usecase.starship

import com.example.domain.repository.SwapiRepository
import javax.inject.Inject

class GetStarshipUseCase @Inject constructor(
    private val swapiRepository: SwapiRepository
) {
    suspend operator fun invoke(starshipId: Int) = swapiRepository.getStarship(starshipId)
}