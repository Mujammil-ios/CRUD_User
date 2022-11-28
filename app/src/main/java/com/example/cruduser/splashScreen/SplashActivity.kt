package com.example.cruduser.splashScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import com.example.cruduser.MainActivity
import com.example.cruduser.databinding.ActivitySplashBinding
import com.example.cruduser.login.LoginActivity
import com.example.cruduser.userMVP.RegisterActivity
import com.example.cruduser.utils.AppPreference
import com.example.cruduser.utils.BaseAppCompactActivity
import com.example.cruduser.utils.Constant.Companion.SPLASH_SCREEN_ACTIVITY
import com.example.cruduser.utils.Constant.Companion.TAG
import java.lang.Exception

class SplashActivity : BaseAppCompactActivity() {
    private lateinit var splashBinding: ActivitySplashBinding
    lateinit var appPreference: AppPreference
    var isUserLogin = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(splashBinding.root)
        initView()
    }

    private fun initView() {
        Log.i(TAG, "$SPLASH_SCREEN_ACTIVITY initView")
        try{
            Handler(Looper.getMainLooper()).postDelayed({
                isUserLogin = false

                if (isUserLogin) {
                        val intent = Intent(this, MainActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
    //                    intent.putExtra(getString(R.string.isFromDEP_intent_key),false)
                        startActivity(intent)
                } else {
                    val intent = Intent(this, MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                    startActivity(intent)
                }
            }, 2000)

        }
        catch (e: Exception){
            e.printStackTrace()
        }

    }
}