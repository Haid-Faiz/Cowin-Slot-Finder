package com.example.cowinvsf.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.cowinvsf.R
import com.example.cowinvsf.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        _binding!!.sessionsByPin.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_pinCodeDialogFragment)
        }

        _binding!!.sessionsByDistrict.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_districtDialogFragment)
        }

        _binding!!.centresByPin.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_pinCodeDialogFragment)
        }

        _binding!!.centresByDistrict.setOnClickListener {
            navController.navigate(R.id.action_homeFragment_to_districtDialogFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}