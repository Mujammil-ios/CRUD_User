package com.example.cruduser.utils

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.net.ConnectivityManager
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import com.example.cruduser.R
import java.lang.Exception

class CommonUtils {
    private var Dialog_progress: Dialog? = null

    fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }

    fun showDialog(mContext: Context?, text: String): Dialog {
        val dialog = Dialog(mContext!!)
        dialog.setContentView(R.layout.alert_dialog_layout)
        dialog.setCancelable(false)
        val alertText = dialog.findViewById<TextView>(R.id.alert_Text_Tv)
        val okButton = dialog.findViewById<Button>(R.id.delete_ok_Btn)
        alertText.text = text
        okButton.setOnClickListener {
            dialog.dismiss()
        }
        return dialog
    }

    fun showProgress(context: Context) {
        try {
            if (Dialog_progress == null) {
                initProgress(context)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        try {
            if (!Dialog_progress!!.isShowing && !(context as Activity).isFinishing) {
                Dialog_progress!!.show()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun initProgress(mContext: Context?) {
        Dialog_progress = Dialog(mContext!!)
        Dialog_progress!!.setContentView(R.layout.dialog_progress_overlay)
        Dialog_progress!!.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        Dialog_progress!!.setCancelable(false)
    }

    fun hideProgress() {
        try {
            if (Dialog_progress != null) {
                if (Dialog_progress!!.isShowing) Dialog_progress!!.dismiss()
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

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