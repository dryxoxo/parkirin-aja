package com.example.parkiraja.fragment

import  android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.parkiraja.LandingActivity
import com.example.parkiraja.LoginActivity
import com.example.parkiraja.R
import com.example.parkiraja.databinding.FragmentUserBinding
import com.example.parkiraja.editProfilActivity
import com.google.firebase.auth.FirebaseAuth

class UserFragment : Fragment() {

    private var _binding: FragmentUserBinding? = null
    lateinit var auth: FirebaseAuth

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentUserBinding.inflate(inflater, container, false)
        return binding.root
    }
}