package com.example.startnglogistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingPage extends AppCompatActivity {

    Button mButtonSignup;
    Button mButtonSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        mButtonSignup = findViewById(R.id.btn_signup);
        mButtonSignin = findViewById(R.id.btn_signin);

        mButtonSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signinIntent = new Intent(LandingPage.this, LoginActivity.class);
                startActivity(signinIntent);
                finish();
            }
        });

        mButtonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupIntent = new Intent(LandingPage.this, SignupPage.class);
                startActivity(signupIntent);
                finish();
            }
        });

    }
}
