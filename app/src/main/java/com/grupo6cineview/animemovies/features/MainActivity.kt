package com.grupo6cineview.animemovies.features

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.grupo6cineview.animemovies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    //->Instancia da ViewModel
         //this -> A viewModel é desta mesma main activity
        //owner precisa ser uma activity
//        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        //Preciso escutar as alteracoes da mainActivity. Faca agora o onserver.
//
//        viewModel.test.observe(this,{
//            binding.etMainTest.text = Editable.Factory.getInstance().newEditable(it)
//        })
    }
//    override fun onSaveInstanceState(outState : Bundle) {
//        super.onSaveInstanceState(outState)
//        //Aqui eu estou setando meu live data na MainActivity
//        viewModel.setTest(binding.etMainTest.text.toString())
//    }

}