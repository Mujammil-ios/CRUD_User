package com.example.cruduser.userMVP

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cruduser.databinding.ActivityRegisterBinding
import com.example.cruduser.utils.BaseAppCompactActivity

class RegisterActivity : BaseAppCompactActivity() {
    private lateinit var registerBinding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(registerBinding.root)
        initView()
    }

    private fun initView() {
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        supportActionBar!!.title = "Create Account"
    }


}