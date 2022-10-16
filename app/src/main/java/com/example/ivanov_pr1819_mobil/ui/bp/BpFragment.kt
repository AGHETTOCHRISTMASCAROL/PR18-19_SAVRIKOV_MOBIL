package com.example.ivanov_pr1819_mobil.ui.bp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ivanov_pr1819_mobil.databinding.FragmentBpBinding
import com.example.ivanov_pr1819_mobil.databinding.FragmentSlideshowBinding
import com.example.ivanov_pr1819_mobil.ui.slideshow.SlideshowViewModel

class BpFragment : Fragment(){
    private var _binding: FragmentBpBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val bpViewModel =
            ViewModelProvider(this).get(BpViewModel::class.java)

        _binding = FragmentBpBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textview
        bpViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}