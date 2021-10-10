package com.hackyeon.rx_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.hackyeon.rx_retrofit.databinding.ActivityMainBinding
import com.hackyeon.rx_retrofit.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()
    }

    private fun initView(){
        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)
        binding.apply {
            lifecycleOwner = this@MainActivity
            viewModel = this@MainActivity.mainViewModel
        }
    }
}