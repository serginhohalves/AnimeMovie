package com.grupo6cineview.animemovies.features.home.usecase

import com.grupo6cineview.animemovies.api.ApiService
import com.grupo6cineview.animemovies.features.home.repository.HomeRepository


class HomeUseCase {

    private val homeRepository = HomeRepository()

  suspend fun getNowPlayingMovies(){
        homeRepository.safeApiCall{
            ApiService.tmdbApi.getNowPlayingMovies()
        }
    }
}