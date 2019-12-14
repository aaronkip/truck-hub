package com.jamesnyakush.carhub.util

import android.content.Context
import android.content.SharedPreferences
import com.jamesnyakush.carhub.util.Constants.IS_FIRST_TIME
import com.jamesnyakush.carhub.util.Constants.PREF_NAME

class SessionManager(context: Context) {
    private var sharedPreferences: SharedPreferences =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

    fun setNotFirstTime(isFirstTime: Boolean) {
        sharedPreferences.edit().putBoolean(IS_FIRST_TIME, isFirstTime).apply()
    }

    fun isFirstTime(): Boolean {
        return sharedPreferences.getBoolean(IS_FIRST_TIME, false)
    }

}