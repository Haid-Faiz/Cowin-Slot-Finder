package com.example.cowinvsf.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cowinvsf.databinding.FragmentDialogDistrictBinding
import com.example.cowinvsf.databinding.FragmentDialogPincodeBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class DistrictDialogFragment : BottomSheetDialogFragment() {

    private var _binding : FragmentDialogDistrictBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDialogDistrictBinding.inflate(inflater, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding!!.cancelButton.setOnClickListener { dismiss() }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}