package com.axellinoanggoro.binar_ch4_latihan_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.axellinoanggoro.binar_ch4_latihan_navigation.databinding.FragmentHomeBinding
import com.axellinoanggoro.binar_ch4_latihan_navigation.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginBtn.setOnClickListener {
            val username = binding.loginUsername.text.toString()
            val bundle = Bundle()
            bundle.putString("USERNAME", username)
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment, bundle)
        }

        binding.loginTv.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
    }

}