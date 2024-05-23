package com.example.interactiveforchield.main_screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.interactiveforchield.R
import com.example.interactiveforchield.constant.MAIN
import com.example.interactiveforchield.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnAnimal.setOnClickListener {
            MAIN.navController.navigate(R.id.action_mainFragment_to_animalFragment)
        }
        binding.btnProfession.setOnClickListener {
            MAIN.navController.navigate(R.id.action_mainFragment_to_professionsFragment)
        }
        binding.btnTransport.setOnClickListener {
            MAIN.navController.navigate(R.id.action_mainFragment_to_transportFragment)
        }
    }





}