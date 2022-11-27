package com.example.cruduser.login

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.cruduser.R
import com.example.cruduser.databinding.ActivityLoginBinding
import com.example.cruduser.login.mvp.LoginPresenter
import com.example.cruduser.utils.AppPreference
import com.example.cruduser.utils.BaseAppCompactActivity
import com.example.cruduser.utils.Constant.Companion.LOGIN_ACTIVITY
import com.example.cruduser.utils.Constant.Companion.TAG

class LoginActivity : BaseAppCompactActivity() {
    private lateinit var loginBinding: ActivityLoginBinding
    lateinit var loginPresenter: LoginPresenter
    lateinit var appPreference: AppPreference
    private val mActivity: Activity = this@LoginActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)
        initView()
        clickEvents()
    }


    private fun initView() {
        Log.i(TAG, "$LOGIN_ACTIVITY initView")
        supportActionBar!!.hide()
        hideSoftKeyboard(mActivity)
        appPreference = AppPreference(this)
//        loginPresenter = LoginPresenter(this, this)
    }

    private fun clickEvents() {
        loginBinding.loginBtn.setOnClickListener {
            Log.i(TAG, "$LOGIN_ACTIVITY clickEvents")
            /* if (isValid()) {
                 loginPresenter.login(loginBinding.phoneNumberTv.text.toString(), loginBinding.passwordTv.text.toString())
             }*/
//            loginPresenter.login(loginBinding.phoneNumberTv.text.toString(), loginBinding.passwordTv.text.toString())

            /* val intent = Intent(this, MainActivity::class.java)
             startActivity(intent)*/
        }
    }
}