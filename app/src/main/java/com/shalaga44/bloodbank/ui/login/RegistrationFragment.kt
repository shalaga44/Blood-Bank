package com.shalaga44.bloodbank.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.shalaga44.bloodbank.R
import com.shalaga44.bloodbank.databinding.FragmentRegistrationBinding


class RegistrationFragment : Fragment(R.layout.fragment_registration) {

    private lateinit var binding: FragmentRegistrationBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRegistrationBinding.bind(view)
        binding.registrationButton.setOnClickListener {
            Navigation.findNavController(binding.root)
                .navigate(R.id.action_registrationFragment_to_confirmationFragment)
        }
    }

}