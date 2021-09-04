package com.grupo6cineview.animemovies.api

import com.grupo6cineview.animemovies.model.NowPlaying
import retrofit2.Response
import retrofit2.http.GET

interface TMDBApi {
    @GET("movie/now_playing?api_key=055510d3d6b7f9fe9f8ba9c254048055")
    fun getNowPlayingMovies(): Response<NowPlaying>
}

