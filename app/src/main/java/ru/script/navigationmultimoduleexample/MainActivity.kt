package ru.script.navigationmultimoduleexample

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handleIntent(intent)
    }

    private fun handleIntent(intent: Intent?) {
        val appLinkAction: String? = intent?.action
        val appLinkData: Uri? = intent?.data
        showDeepLinkOffer(appLinkAction, appLinkData)
    }

    private fun showDeepLinkOffer(appLinkAction: String?, appLinkData: Uri?) {
        // 1
        if (Intent.ACTION_VIEW == appLinkAction && appLinkData != null) {
            // 2
            val promotionCode = appLinkData.getQueryParameter("code")
            if (promotionCode.isNullOrBlank().not()) {
                findNavController(R.id.one_nav)?.navigate(R.id.someFragment)
            }
        }
    }
}