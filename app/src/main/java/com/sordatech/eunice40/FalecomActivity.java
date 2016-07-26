package com.sordatech.eunice40;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class FalecomActivity extends AppCompatActivity {

    private static WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falecom);

        browser = (WebView)findViewById(R.id.webviewfalecom);
        String url = "https://docs.google.com/forms/d/e/1FAIpQLScd3b-eX2FmWCNJjphYBjxl6g1svH7OrcpHOZylJSEi6xGq-Q/viewform";
        browser.getSettings().getJavaScriptEnabled();
        browser.loadUrl(url);
    }
}
