package com.bloxofcode.simplifymobileapp;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class RegisterActivity extends AppCompatActivity {
    private TextView tvSignup;
    private EditText etSetUsername,etSetPassword,etSetConfirmPassword;
    private Button btnCancel,btnSignup;

    //public FunctionUtil functionUtil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        tvSignup = (TextView) findViewById(R.id.tvSignup);
        etSetUsername = (EditText) findViewById(R.id.etSetUsername);
        etSetPassword = (EditText) findViewById(R.id.etSetPassword);
        etSetConfirmPassword = (EditText) findViewById(R.id.etConfirmPassword);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnSignup = (Button) findViewById(R.id.btnPressSignUp);

        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/Roboto-Light.ttf");


        tvSignup.setTypeface(myCustomFont);
        etSetUsername.setTypeface(myCustomFont);
        etSetPassword.setTypeface(myCustomFont);
        etSetConfirmPassword.setTypeface(myCustomFont);
        btnCancel.setTypeface(myCustomFont);
        btnSignup.setTypeface(myCustomFont);

        btnCancel.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED
                        btnCancel.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
                        //functionUtil.showDebugLine("DebugLine","Pressed!");
                        return true; // if you want to handle the touch event

                    case MotionEvent.ACTION_UP:
                        // RELEASED
                        btnCancel.setPaintFlags(0);
                        //functionUtil.showDebugLine("DebugLine","Not Pressed!");
                        Intent i=new Intent(RegisterActivity.this,LoginActivity.class);
                        startActivity(i);
                        finish();
                        return true; // if you want to handle the touch event

                }
                return false;
            }
        });


    }
}
