package youtube.demo.youtubedemo.Fragments;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import java.text.SimpleDateFormat;
import java.util.Date;

import youtube.demo.youtubedemo.R;

public class fragment_diet extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_diet, container, false);

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
      //  SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
      //  String age = sharedPref.getString("age","");

        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("dd");

        Uri.Builder builder = new Uri.Builder();
        builder.scheme("file")
                .appendPath("android_asset")
                .appendPath("1200"+" "+"("+ft.format(date)+")"+".html");
        String myUrl = builder.build().toString();

        webView.loadUrl(myUrl);
        return rootView;


    }
}







