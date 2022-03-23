package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.navigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding = FragmentHomeBinding.inflate(layoutInflater)

        //action_homeFragment_to_insideHome
        var navController = findNavController()

        //onclick
        binding.buttonHomeToInside.setOnClickListener{
            Toast.makeText(context, "prueba", Toast.LENGTH_LONG).show()
            //navController.navigate(R.id.action_homeFragment_to_insideHome)
            val textArgument = "desde el home"
            var directions = HomeFragmentDirections.actionHomeFragmentToInsideHome(textArgument)
            navController.navigate(directions)

        }

        return binding.root
    }



}