package com.fivestars.krossplatform

import android.webkit.WebView
import android.webkit.WebViewClient
import com.fivestars.cordovaalternativepattern.com.fivestars.krossplatform.JavascriptMessageHandler

class WebClient : WebViewClient() {

    lateinit var javascriptMessageHandler: JavascriptMessageHandler

    override fun onPageFinished(webView: WebView, url: String) {
        super.onPageFinished(webView, url)
        javascriptMessageHandler =
            JavascriptMessageHandler(
                webView
            )
    }

}