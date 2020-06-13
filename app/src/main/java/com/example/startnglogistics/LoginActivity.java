package com.example.startnglogistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btnSigninUser;
    Button btnSigninShipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSigninUser = findViewById(R.id.btn_user_signin);
        btnSigninShipper = findViewById(R.id.btn_shipper_signin);

        btnSigninUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent userSigninIntent = new Intent(LoginActivity.this, LoginPage.class);
                startActivity(userSigninIntent);
                finish();
            }
        });

        btnSigninShipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shipperSigninIntent = new Intent(LoginActivity.this, LoginPageShipper.class);
                startActivity(shipperSigninIntent);
                finish();
            }
        });
    }
}
