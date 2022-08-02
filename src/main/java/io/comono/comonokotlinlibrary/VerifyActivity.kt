package io.comono.comonokotlinlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class VerifyActivity : AppCompatActivity() {

    lateinit var webview: WebView

    val hosturl = "https://ecocomonoreact.azurewebsites.net/customer-details?"

    val param1 = intent.getStringExtra("workitemId")
    val param2 = intent.getStringExtra("customerName")
    val param3 = intent.getStringExtra("customerEmail")
    val param4 = intent.getStringExtra("branchCode")
    val param5 = intent.getStringExtra("segmentId")
    val param6 = intent.getStringExtra("address")
    val param7 = intent.getStringExtra("landmark")
    val param8 = intent.getStringExtra("state")
    val param9 = intent.getStringExtra("lga")
    val param10 = intent.getStringExtra("createdBy")
    val param11 = intent.getStringExtra("customerImage")
    val param12 = intent.getStringExtra("Latitude")
    val param13 = intent.getStringExtra("Longitude")

    val postparam = hosturl + "workitemId=" + param1 + "&customerName=" + param2 + "&customerEmail=" + param3 + "&branchCode=" + param4 + "&segmentId=" + param5 + "&address=" + param6 + "&landmark=" + param7 + "&state=" + param8 + "&lga=" + param9 + "&createdBy=" + param10 + "&customerImage=" + param11 + "&Latitude=" + param12 + "&Longitude=" + param13

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        webview = findViewById(R.id.web_view)

        webview.loadUrl(postparam)

        val webSettings = webview.settings
        webSettings.javaScriptEnabled = true

        webview.webViewClient = WebViewClient()
    }

    override fun onBackPressed() {
        if (webview.canGoBack())
            webview.goBack()
        else
            super.onBackPressed()
    }
}