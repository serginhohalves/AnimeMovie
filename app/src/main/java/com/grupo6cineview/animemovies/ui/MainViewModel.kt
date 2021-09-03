package com.grupo6cineview.animemovies.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {






    //-> Aqui voce faz o live data ja que é ele que vai salvar e recuperar dados.
    //MutableLiveData - mutável(Permite Alteracoes)
    //Livedata -> Imutavel(Somente Leitura)
    //Recomendacao-> so quem deve ter acesso ao live data é a view model.
//    private val _test: MutableLiveData<String> = MutableLiveData()
//    val test: LiveData<String>
//    get()= _test
    //->Esse metodo aqui é para atualizar o live data e tem 2 formas de fazer isso conforme abaixo.
//    fun setTest(value:String){
//        _test.value = value | ->Esse safado aqui trava a main thread do usuario. Passar longe.
//        _test.postValue(value)//-> Sempre usar este metodo poios ele nao trava a mein thread.
//    }

}