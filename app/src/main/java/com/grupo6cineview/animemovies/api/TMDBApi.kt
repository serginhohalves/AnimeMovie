package com.grupo6cineview.animemovies.api

import com.grupo6cineview.animemovies.model.NowPlaying
import com.grupo6cineview.animemovies.model.Popular
import retrofit2.Response
import retrofit2.http.GET

interface TMDBApi {
    @GET("movie/now_playing")
    fun getNowPlayingMovies(): Response<NowPlaying>

    @GET("movie/popular")
    fun getPopularMovies(): Response<Popular>


}

