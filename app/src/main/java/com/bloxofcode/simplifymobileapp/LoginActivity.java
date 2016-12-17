package com.bloxofcode.simplifymobileapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private TextView tv;
    private EditText etUsername,etPassword;
    private Button btnSignUp,btnForgotPass,btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv = (TextView) findViewById(R.id.tvLogin);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);
        btnForgotPass = (Button) findViewById(R.id.btnForgotPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Roboto-Light.ttf");

        tv.setTypeface(myCustomFont);
        etUsername.setTypeface(myCustomFont);
        etPassword.setTypeface(myCustomFont);
        btnSignUp.setTypeface(myCustomFont);
        btnForgotPass.setTypeface(myCustomFont);
        btnLogin.setTypeface(myCustomFont);
    }
}
