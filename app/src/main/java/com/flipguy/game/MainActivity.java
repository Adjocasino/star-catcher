package com.flipguy.game;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.setStatusBarColor(Color.parseColor("#ffd59e"));
        w.setNavigationBarColor(Color.parseColor("#7cc46b"));

        webView = new WebView(this);
        webView.setBackgroundColor(Color.parseColor("#ffd59e"));
        WebSettings s = webView.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setMediaPlaybackRequiresUserGesture(false);
        webView.setWebViewClient(new WebViewClient());
        setContentView(webView);
        webView.loadUrl("file:///android_asset/index.html");
    }

    @Override
    protected void onPause() { super.onPause(); if (webView != null) webView.onPause(); }

    @Override
    protected void onResume() { super.onResume(); if (webView != null) webView.onResume(); }
}
