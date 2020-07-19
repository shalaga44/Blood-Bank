package com.shalaga44.bloodbank.ui.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.shalaga44.bloodbank.R
import com.shalaga44.bloodbank.databinding.FragmentLogInBinding
import com.shalaga44.bloodbank.databinding.FragmentMainLogInBinding


class MainLogInFragment : Fragment(R.layout.fragment_main_log_in) {

    private lateinit var binding: FragmentMainLogInBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainLogInBinding.bind(view)

        binding.loginButton.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_mainLogInFragment_to_logInFragment)
        }
        binding.registrationButton.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_mainLogInFragment_to_registrationFragment)
        }

    }

}