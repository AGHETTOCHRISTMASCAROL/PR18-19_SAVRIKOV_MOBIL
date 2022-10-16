package com.example.ivanov_pr1819_mobil.ui.home


import android.R
import android.content.Context
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

import com.example.ivanov_pr1819_mobil.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    //private val imageView: ImageView? = null
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    /*override fun setImageResource(inflater: LayoutInflater,
                                  container: ViewGroup?,
                                  savedInstanceState: Bundle?): View {

        val imageView: ImageView = findViewById<ImageView>(R.id.icon)
        imageView.setImageResource(R.drawable.ic_)
    }*/
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        //val resourceId = R.drawable.campic
        //imageView!!.setImageResource(resourceId)

        val homeViewModel =
            ViewModelProvider(this).get(HomeVievModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textview
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        //val imageView: ImageView = binding.icon
        //homeViewModel.



        return root
    }

    /*override fun changeImage(resouseId: Int){
        val resourceId = R.drawable.campic
        imageView!!.setImageResource(resourceId)

    }*/
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
}
