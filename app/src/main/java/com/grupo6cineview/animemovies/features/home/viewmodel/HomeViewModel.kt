package com.grupo6cineview.animemovies.features.home.viewmodel

import androidx.lifecycle.ViewModel
import com.grupo6cineview.animemovies.features.home.usecase.HomeUseCase

class HomeViewModel: ViewModel() {

    //viewmodel chamando a useCase.
   private val homeUseCase = HomeUseCase()


    //Essa funcao veio da View.
    suspend fun getNowPlayingMovies() {

        homeUseCase.getNowPlayingMovies() //indo da viewmodel para view
        //viewmodel nao faz chamada de api.

    }
}