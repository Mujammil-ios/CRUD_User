package com.example.cruduser.utils

import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception

open class BaseAppCompactActivity: AppCompatActivity() {
    fun hideSoftKeyboard(mActivity: Activity) {
        try {
            val imm = mActivity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
            // Find the currently focused view, so we can grab the correct window token from it.
            var view = mActivity.currentFocus
            // If no view currently has focus, create a new one, just so we can grab a window token from it
            if (view == null) {
                view = View(mActivity)
            }
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}