package com.example.startnglogistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPageShipper extends AppCompatActivity {

    Button mButtonForgetPassword;
    Button mButtonNewUser;
    Button mButtonSigninShipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page_shipper);

        mButtonNewUser = findViewById(R.id.btn_new_user_signup_sp);
        mButtonSigninShipper = findViewById(R.id.sign_in_shipper);


        mButtonNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewUser = new Intent(LoginPageShipper.this, LandingPage.class);
                startActivity(intentNewUser);
                finish();
            }
        });

        mButtonSigninShipper.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                Intent intentShipperSignin = new Intent(LoginPageShipper.this, CreateShipmentActivity.class);
                startActivity(intentShipperSignin);
                finish();

            }
        });
    }
}
