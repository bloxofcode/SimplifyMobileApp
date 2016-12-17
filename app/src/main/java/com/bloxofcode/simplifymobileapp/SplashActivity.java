package com.bloxofcode.simplifymobileapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        tv = (TextView) findViewById(R.id.textview);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Roboto-Light.ttf");
        tv.setTypeface(myCustomFont);
    }
}
