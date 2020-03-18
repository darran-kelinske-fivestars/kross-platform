package com.fivestars.cordovaalternativepattern.com.fivestars.krossplatform

import android.net.Uri
import android.webkit.WebView
import androidx.webkit.WebMessageCompat
import androidx.webkit.WebMessagePortCompat
import androidx.webkit.WebViewCompat
import com.fivestars.krossplatform.KEY_CAPTURE_PORT


class JavascriptMessageHandler(webView: WebView) {

    private val webMessagePorts = WebViewCompat.createWebMessageChannel(webView)

    init {
        val destPort = arrayOf(webMessagePorts[1])
        WebViewCompat.postWebMessage(webView, WebMessageCompat(KEY_CAPTURE_PORT, destPort), Uri.EMPTY)
    }

    fun setWebMessageCallback(webMessageCallback: WebMessagePortCompat.WebMessageCallbackCompat) {
        webMessagePorts[0].setWebMessageCallback(webMessageCallback)
    }
}