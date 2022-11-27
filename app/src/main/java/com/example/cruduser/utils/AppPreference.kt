package com.example.cruduser.utils

import android.content.Context
import android.content.SharedPreferences

class AppPreference(context: Context) {
    private var appSharedPrefs: SharedPreferences =
        context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = appSharedPrefs.edit()

    fun isUserLogin(): Boolean {
        return appSharedPrefs.getBoolean("isUserLogin", false)
    }

    fun setUserLogin(value: Boolean?) {
        editor.putBoolean("isUserLogin", value!!)
        editor.commit()
    }

    fun isAdmin(): Boolean {
        return appSharedPrefs.getBoolean("isDEP", false)
    }

    fun setAdmin(value: Boolean?) {
        editor.putBoolean("isDEP", value!!)
        editor.commit()
    }

    fun getToken(): String? {
        return appSharedPrefs.getString("setToken", "")
    }

    fun setToken(data: String?) {
        editor.putString("setToken", data)
        editor.commit()
    }

    fun getRole(): String? {
        return appSharedPrefs.getString("setRole", "")
    }

    fun setRole(data: String?) {
        editor.putString("setRole", data)
        editor.commit()
    }

    fun getSelectedUserId(): String? {
        return appSharedPrefs.getString("SelectedUserId", "")
    }

    fun setSelectedUserId(data: String?) {
        editor.putString("SelectedUserId", data)
        editor.commit()
    }
    fun getSelectedProductId(): String? {
        return appSharedPrefs.getString("SelectedUserId", "")
    }

    fun setSelectedProductId(data: String?) {
        editor.putString("SelectedUserId", data)
        editor.commit()
    }
}