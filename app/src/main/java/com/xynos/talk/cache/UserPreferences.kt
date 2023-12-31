package com.xynos.talk.cache

import android.content.Context

class UserPreferences(context: Context) {
    private val sharedPref = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

    fun setCurrentUserId(userId: String) {
        with(sharedPref.edit()) {
            putString(KEY_CURRENT_USER_ID, userId)
            apply()
        }
    }

    fun getCurrentUserId(): String {
        return sharedPref.getString(KEY_CURRENT_USER_ID, "") ?: ""
    }

    companion object {
        private const val PREFERENCES_NAME = "com.your.package.name.USER_PREFERENCES"
        private const val KEY_CURRENT_USER_ID = "current_user_id"
    }
}
