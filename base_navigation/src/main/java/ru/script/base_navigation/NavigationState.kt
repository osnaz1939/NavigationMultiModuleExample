package ru.script.base_navigation

import android.content.Context
import android.preference.PreferenceManager
import java.util.*

class NavigationState {

    //TODO inject context from base
    companion object{
        fun getNavState(context: Context?):Stack<String>?{
            var stackSet = PreferenceManager.getDefaultSharedPreferences(context).getStringSet("backstack",null)
            val test = stackSet?.toList()?.reversed()
            var backstack = Stack<String>()
            if (test != null) {
                for(screen in test){
                    backstack.push(screen)
                }
            }
            return backstack
        }

        fun putNavState(iv: Stack<String>, context: Context?) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putStringSet("backstack",iv.toSet())
        }


    }
}