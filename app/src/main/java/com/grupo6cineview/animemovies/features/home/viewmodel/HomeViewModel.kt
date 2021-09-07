package com.grupo6cineview.animemovies.features.home.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.grupo6cineview.animemovies.api.ApiError.message
import com.grupo6cineview.animemovies.base.BaseViewModel
import com.grupo6cineview.animemovies.features.home.usecase.HomeUseCase
import com.grupo6cineview.animemovies.model.Popular
import com.grupo6cineview.animemovies.model.Result
import com.grupo6cineview.animemovies.utils.ResponseApi
import kotlinx.coroutines.launch
import retrofit2.Response

class HomeViewModel: BaseViewModel() {

    //viewmodel chamando a useCase.
   private val homeUseCase = HomeUseCase()

    //NowPlaying
   private val _onSuccessNowPlaying:MutableLiveData<List<Result>>
   = MutableLiveData()
    val onSuccessNowPlaying: LiveData<List<Result>>
    get() = _onSuccessNowPlaying


    private val _onErrorNowPlaying:MutableLiveData<Int>
            = MutableLiveData()
    val onErrorNowPlaying: LiveData<Int>
        get() = _onErrorNowPlaying

    //Error

    private val _onSuccessPopular:MutableLiveData<Popular>
            = MutableLiveData()
    val onSuccessPopular: LiveData<Popular>
        get() = _onSuccessPopular


    private val _onErrorPopular:MutableLiveData<Int>
            = MutableLiveData()
    val onErrorPopular: LiveData<Int>
        get() = _onErrorPopular


    //Essa funcao veio da View.
    fun getNowPlayingMovies() {

        viewModelScope.launch {

            callApi(

                suspend { homeUseCase.getNowPlayingMovies() },
                onSuccess = {
                    val result = it as? List<*>
                    _onSuccessNowPlaying.postValue(
                        result?.filterIsInstance<Result>()
                    )
                }
            )
        }
    }

    fun getPopularMovies() {
        viewModelScope.launch {

            callApi(
                suspend { homeUseCase.getPopularMovies() },
                onSuccess = {
                    _onSuccessPopular.postValue(
                        it as? Popular
                    )
                }
            )
        }
    }
}