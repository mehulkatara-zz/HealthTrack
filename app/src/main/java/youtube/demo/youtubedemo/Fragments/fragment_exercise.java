package youtube.demo.youtubedemo.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import youtube.demo.youtubedemo.R;

public class fragment_exercise extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_exercise, container, false);

        WebView webView = (WebView)rootView.findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient() {
            public void onReceivedHttpError(WebView view, int errorCode, String description, String failingUrl) {

            }
        });

            webView.setInitialScale(1);
            webView.getSettings().

            setJavaScriptEnabled(true);

            webView.getSettings().

            setLoadWithOverviewMode(true);

            webView.getSettings().

            setUseWideViewPort(true);

            webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
            webView.setScrollbarFadingEnabled(false);

            webView.loadUrl("http://fit.google.com/");

            return rootView;


        }
    }
