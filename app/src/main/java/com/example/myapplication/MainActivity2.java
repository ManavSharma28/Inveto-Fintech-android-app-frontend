package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView profileButtonNavigate = findViewById(R.id.profileButton);
        Button learnMore = findViewById(R.id.learnMore);
        WebView webView = findViewById(R.id.webView);
        CardView cardETF = findViewById(R.id.cardETF);




        profileButtonNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        learnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);

                webView.setWebViewClient(new WebViewClient());

                String url = "https://www.investopedia.com/terms/e/etf.asp";

                webView.loadUrl(url);
                webView.setVisibility(View.VISIBLE);

                cardETF.setVisibility(View.GONE);

            }
        });
    }
}