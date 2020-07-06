package ru.script.base_navigation

import android.content.Context
import android.preference.PreferenceManager

class NavigationState {

    //TODO inject context from base
    companion object{
        fun getNavState(context:Context?):String?{
            return PreferenceManager.getDefaultSharedPreferences(context).getString("nav","0")
        }

        fun putNavState(iv: String,context:Context?) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString("nav", iv).apply()
        }
    }
}