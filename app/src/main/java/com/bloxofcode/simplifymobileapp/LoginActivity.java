package com.bloxofcode.simplifymobileapp;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private TextView tv;
    private EditText etUsername,etPassword;
    private Button btnSignUp,btnForgotPass,btnLogin;
    private boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
//        super.onBackPressed();
//
//        Context context = getApplicationContext();
//        CharSequence text = "Hello toast!";
//        int duration = Toast.LENGTH_SHORT;
//
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv = (TextView) findViewById(R.id.tvLogin);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnSignUp = (Button) findViewById(R.id.btnRegisterSignUp);
        btnForgotPass = (Button) findViewById(R.id.btnForgotPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Roboto-Light.ttf");

        tv.setTypeface(myCustomFont);
        etUsername.setTypeface(myCustomFont);
        etPassword.setTypeface(myCustomFont);
        btnSignUp.setTypeface(myCustomFont);
        btnForgotPass.setTypeface(myCustomFont);
        btnLogin.setTypeface(myCustomFont);

        btnSignUp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED
                        btnSignUp.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
                        showDebugLine("DebugLine","Pressed!");
                        return true; // if you want to handle the touch event

                    case MotionEvent.ACTION_UP:
                        // RELEASED
                        btnSignUp.setPaintFlags(0);
                        showDebugLine("DebugLine","Not Pressed!");
                        Intent i=new Intent(LoginActivity.this,RegisterActivity.class);
                        startActivity(i);
                        return true; // if you want to handle the touch event

                }
                return false;
            }
        });

        btnForgotPass.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED
                        btnForgotPass.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
                        //showDebugLine("DebugLine","Pressed!");
                        return true; // if you want to handle the touch event

                    case MotionEvent.ACTION_UP:
                        // RELEASED
                        btnForgotPass.setPaintFlags(0);
                        //showDebugLine("DebugLine","Not Pressed!");
                        return true; // if you want to handle the touch event

                }
                return false;
            }
        });

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(i);
                //finish();
            }
        });
    }



    private void showDebugLine(String tagName,String msgString){
        Log.d(tagName,msgString);
    }
}
