package com.example.domain.usecase.film

import com.example.domain.repository.SwapiRepository
import javax.inject.Inject

class GetFilmDetailUseCase @Inject constructor(
    private val swapiRepository: SwapiRepository
) {
    suspend operator fun invoke(filmId: Int) = swapiRepository.getFilmDetail(filmId)
}