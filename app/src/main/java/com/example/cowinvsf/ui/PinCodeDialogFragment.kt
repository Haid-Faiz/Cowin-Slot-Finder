package com.example.cowinvsf.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cowinvsf.databinding.FragmentDialogPincodeBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class PinCodeDialogFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentDialogPincodeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDialogPincodeBinding.inflate(inflater, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding!!.apply {
            pinPickerFirst.minValue = 0
            pinPickerTwo.minValue = 0
            pinPickerThree.minValue = 0
            pinPickerFour.minValue = 0
            pinPickerFive.minValue = 0
            pinPickerSix.minValue = 0

            pinPickerFirst.maxValue = 9
            pinPickerTwo.maxValue = 9
            pinPickerThree.maxValue = 9
            pinPickerFour.maxValue = 9
            pinPickerFive.maxValue = 9
            pinPickerSix.maxValue = 9

            cancelButton.setOnClickListener { this@PinCodeDialogFragment.dismiss() }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}