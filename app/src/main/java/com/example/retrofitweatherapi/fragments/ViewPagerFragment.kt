package com.example.retrofitweatherapi.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.retrofitweatherapi.StartActivity
import com.example.retrofitweatherapi.WeatherPager
import com.example.retrofitweatherapi.databinding.FragmentViewPagerBinding


class ViewPagerFragment : Fragment() {
    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!
    private var check = true

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPagerItem = arguments?.getSerializable("vp") as WeatherPager
        binding.viewPagerTextTV.text = viewPagerItem.text
        binding.viewPagerPicIV.setImageResource(viewPagerItem.img)
        check = viewPagerItem.checkButton
        if (!check) {
            binding.startBTN.visibility = View.VISIBLE
            binding.startBTN.setOnClickListener{
                startActivity(Intent(activity, StartActivity::class.java))
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}



