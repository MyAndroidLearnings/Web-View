package com.sysaxiom.webview

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.net.Uri
import android.webkit.WebChromeClient
import com.rapid.webview.R


class WebViewActivity : Activity() {

    val url = "https://www.google.com"
    val zoomLevel = 125

    //region Variable Declaration
    var mywebview: WebView? = null
    private val ALLOWED_URI_CHARS = "@#&=*+-_.,:!?()/~'%"
    val urlEncoded = Uri.encode(url, ALLOWED_URI_CHARS)
    //endregion

    //region Activity Life Cycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        webViewSetup()
    }
    override fun onStart() {
        super.onStart()
        loadWebView()
    }

    //endregion

    //region Web View
    fun webViewSetup() {
        mywebview = findViewById<WebView>(R.id.webview)
        mywebview!!.setWebChromeClient(WebChromeClient())
        mywebview!!.getSettings().setDomStorageEnabled(true)
        mywebview!!.setInitialScale(zoomLevel)


        mywebview!!.settings.javaScriptEnabled = true
        mywebview!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
    }
    fun loadWebView() {
        mywebview!!.loadUrl(urlEncoded)
    }
    //endregion
}
