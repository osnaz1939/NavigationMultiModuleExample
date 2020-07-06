package ru.script.cache_featureone

import android.content.Context
import android.preference.PreferenceManager

class FeatureOneCachedData {
    companion object{
        fun getCache(context: Context?):String?{
            return PreferenceManager.getDefaultSharedPreferences(context).getString("cache","0")
        }

        fun putCache(iv: String,context: Context?) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString("cache", iv).apply()
        }
    }
}