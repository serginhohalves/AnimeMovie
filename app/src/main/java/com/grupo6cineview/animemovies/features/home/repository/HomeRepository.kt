package com.grupo6cineview.animemovies.features.home.repository

import com.grupo6cineview.animemovies.api.ApiService
import com.grupo6cineview.animemovies.base.BaseRepository
import com.grupo6cineview.animemovies.utils.ResponseApi
import retrofit2.Response

class HomeRepository:BaseRepository() {


    suspend fun getNowPlayingMovies() : ResponseApi
    {
         return safeApiCall {
            ApiService.tmdbApi.getNowPlayingMovies()
        }
    }

    suspend fun getPopularMovies():ResponseApi {
        return safeApiCall{
            ApiService.tmdbApi.getPopularMovies()
        }
    }
}