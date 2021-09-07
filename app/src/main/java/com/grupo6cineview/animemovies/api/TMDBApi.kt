package com.grupo6cineview.animemovies.api

import com.grupo6cineview.animemovies.model.NowPlaying
import com.grupo6cineview.animemovies.model.Popular
import retrofit2.Response
import retrofit2.http.GET

interface TMDBApi {
    @GET("movie/now_playing?api_key=c4370d50b948fdfa0948829a9134f307")
    fun getNowPlayingMovies(): Response<NowPlaying>

    @GET("movie/popular?api_key=c4370d50b948fdfa0948829a9134f307")
    fun getPopularMovies(): Response<Popular>


}

