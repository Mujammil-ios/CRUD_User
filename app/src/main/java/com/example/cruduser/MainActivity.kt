package com.example.cruduser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cruduser.databinding.ActivityMainBinding
import com.example.cruduser.utils.BaseAppCompactActivity
import kotlinx.coroutines.channels.ActorScope

class MainActivity : BaseAppCompactActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
    }
}