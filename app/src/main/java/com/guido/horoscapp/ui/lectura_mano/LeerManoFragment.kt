package com.guido.horoscapp.ui.lectura_mano

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.guido.horoscapp.R
import com.guido.horoscapp.databinding.FragmentLeerManoBinding

class LeerManoFragment : Fragment() {
    private var _binding:FragmentLeerManoBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLeerManoBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}