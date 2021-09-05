package com.grupo6cineview.animemovies.features.home.usecase

import com.grupo6cineview.animemovies.api.ApiService
import com.grupo6cineview.animemovies.extentions.getFullImageUrl
import com.grupo6cineview.animemovies.features.home.repository.HomeRepository
import com.grupo6cineview.animemovies.model.NowPlaying
import com.grupo6cineview.animemovies.utils.ResponseApi

//É aqui que eu vou fazer o tratamento dos dados.
//Vamos tratar os dados e as informacoes de imagem.

class HomeUseCase {

    private val homeRepository = HomeRepository()

  suspend fun getNowPlayingMovies(){
      when(val responseApi =  homeRepository.getNowPlayingMovies()){
         is ResponseApi.Success->{
             val data = responseApi.data as? NowPlaying

             val result = data?.results?.map{
                 it.backdropPath = it.backdropPath.getFullImageUrl()
                 it.poster_path = it.poster_path.getFullImageUrl()
                 it
             }
             result
          }
          is ResponseApi.Error -> {

          }
      }
    }
}