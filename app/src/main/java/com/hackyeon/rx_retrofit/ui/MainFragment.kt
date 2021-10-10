package com.hackyeon.rx_retrofit.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.hackyeon.rx_retrofit.R
import com.hackyeon.rx_retrofit.databinding.FragmentMainBinding
import com.hackyeon.rx_retrofit.viewmodel.MainViewModel

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView(){
        binding.apply {
            lifecycleOwner = this@MainFragment
            viewModel = this@MainFragment.mainViewModel
        }
    }


}