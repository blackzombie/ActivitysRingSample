package com.jbms.activityrings.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.jbms.activityrings.sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnRingStart.setOnClickListener {
            binding.ringView.setInputProgress(arrayListOf(120f, 100f, 60f))
        }
        binding.btnRingInit.setOnClickListener {
            binding.ringView.setInputProgress(arrayListOf(0f, 0f, 0f))
        }

    }
}