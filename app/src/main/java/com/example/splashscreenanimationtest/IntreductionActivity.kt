package com.example.splashscreenanimationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.splashscreenanimationtest.databinding.ActivityIntreductionBinding

class IntreductionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntreductionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityIntreductionBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.splashImage.animate().translationY(-3000f).setDuration(1000).setStartDelay(4000)
        binding.logo.animate().translationY(3000f).setDuration(1000).setStartDelay(4000)
        binding.appName.animate().translationY(3000f).setDuration(1000).setStartDelay(4000)
        binding.lottieAnim.animate().translationY(3000f).setDuration(1000).setStartDelay(4000)


    }
}