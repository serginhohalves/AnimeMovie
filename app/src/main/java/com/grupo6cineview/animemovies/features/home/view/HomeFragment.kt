package com.grupo6cineview.animemovies.features.home.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.grupo6cineview.animemovies.databinding.FragmentHomeBinding
import com.grupo6cineview.animemovies.features.home.viewmodel.HomeViewModel

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null
    private lateinit var viewModel:HomeViewModel // View <=> ViewModel


    override fun onCreateView(
        inflater : LayoutInflater, container : ViewGroup?,
        savedInstanceState : Bundle?
    ) : View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding?.root
    }
    override fun onViewCreated(view : View, savedInstanceState : Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //para usar a viewmodel no fragment
        //precisa ser nao nulo
        activity?.let {
            viewModel = ViewModelProvider(it)[HomeViewModel::class.java]

            viewModel.command = MutableLiveData()

        //->Aqui estou setando minha vew com a viewmodel
            viewModel.getNowPlayingMovies()

            viewModel.getPopularMovies()

            setupObservables()
        }
    }

    private fun setupObservables() {
        activity?.let{
            viewModel.onSuccessNowPlaying.observe(it,{
                Log.i("teste",it.toString())
            })

            viewModel.onErrorNowPlaying.observe(it,{

            })

            viewModel.onSuccessPopular.observe(it,{

            })
            viewModel.onErrorPopular.observe(it,{

            })

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }


}