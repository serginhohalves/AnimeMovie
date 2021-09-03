package com.grupo6cineview.animemovies.features.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.grupo6cineview.animemovies.databinding.FragmentHomeBinding
import com.grupo6cineview.animemovies.features.MainViewModel

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null

    private lateinit var viewModel:MainViewModel
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
            viewModel = ViewModelProvider(it)[MainViewModel::class.java]
//            viewModel.test.observe(it,{
//
//            })
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }


}