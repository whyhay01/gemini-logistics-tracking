package com.example.startnglogistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingPage extends AppCompatActivity {

    Button mButtonSignupShipper;
    Button mButtonSignup;
    Button mButtonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        mButtonSignupShipper = findViewById(R.id.btn_sign_up_shipper);
        mButtonSignup = findViewById(R.id.btn_signup);
        mButtonlogin = findViewById(R.id.btn_login);

        mButtonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoginPage = new Intent(LandingPage.this, LoginPage.class);
                startActivity(intentLoginPage);
            }
        });

        mButtonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSignupUser = new Intent(LandingPage.this,UserRegistrationForm.class);
                startActivity(intentSignupUser);
            }
        });

    }
}
