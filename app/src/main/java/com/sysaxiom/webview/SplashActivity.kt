package com.sysaxiom.webview

import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.support.v7.app.AppCompatActivity;
import com.rapid.webview.R

class SplashActivity : AppCompatActivity() {

    private val splashTime = 3000L // 3 seconds
    private lateinit var myHandler : Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        myHandler = Handler()

        myHandler.postDelayed({
            goToMainActivity()
        },splashTime)
    }

    private fun goToMainActivity(){

        val mainActivityIntent = Intent(applicationContext, WebViewActivity::class.java)
        startActivity(mainActivityIntent)
        finish()
    }
}

