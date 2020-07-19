package com.shalaga44.bloodbank.ui.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.shalaga44.bloodbank.R
import com.shalaga44.bloodbank.databinding.FragmentConfirmationBinding

class ConfirmationFragment : Fragment(R.layout.fragment_confirmation) {

    private lateinit var binding: FragmentConfirmationBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentConfirmationBinding.bind(view)

        binding.editableFullName.button.setOnClickListener {
            if (binding.editableFullName.editText.visibility == View.GONE) {
                binding.editableFullName.editText.setText(binding.editableFullName.textView.text?.toString())
                binding.editableFullName.textView.visibility = View.GONE
                binding.editableFullName.editText.visibility = View.VISIBLE
            }
            else{
                binding.editableFullName.textView.setText(binding.editableFullName.editText.text?.toString())
                binding.editableFullName.editText.visibility = View.GONE
                binding.editableFullName.textView.visibility = View.VISIBLE
            }
        }



    }

}