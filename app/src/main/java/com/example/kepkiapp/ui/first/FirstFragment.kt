package com.example.kepkiapp.ui.first

import androidx.navigation.fragment.findNavController
import com.example.core_ui.BaseFragment
import com.example.kepkiapp.R
import com.example.kepkiapp.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment<FragmentFirstBinding>(FragmentFirstBinding::inflate) {


    override fun setupUI() {
        binding().signUp.setOnClickListener {
            findNavController().navigate(R.id.secondFragment)
        }
    }

}