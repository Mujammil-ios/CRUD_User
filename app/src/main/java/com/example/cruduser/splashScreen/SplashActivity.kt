package com.example.cruduser.splashScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cruduser.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var splashBinding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(splashBinding.root)
    }
}