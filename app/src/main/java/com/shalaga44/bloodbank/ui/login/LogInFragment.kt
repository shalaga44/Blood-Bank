package com.shalaga44.bloodbank.ui.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.shalaga44.bloodbank.R
import com.shalaga44.bloodbank.databinding.FragmentLogInBinding

class LogInFragment : Fragment(R.layout.fragment_log_in) {
    private lateinit var binding: FragmentLogInBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding=FragmentLogInBinding.bind(view)
        binding.loginButton.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_logInFragment_to_mainActivity)
        }
    }

}