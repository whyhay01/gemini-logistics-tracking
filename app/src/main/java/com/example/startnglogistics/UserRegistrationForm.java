package com.example.startnglogistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserRegistrationForm extends AppCompatActivity {

    Button mButtonSignupUser;
    Button mButtonSignupShipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration_form);

         mButtonSignupUser = findViewById(R.id.btn_sign_up_user);
         mButtonSignupShipper = findViewById(R.id.btn_sign_up_as_shipper);

         mButtonSignupUser.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intentUserLogin = new Intent(UserRegistrationForm.this, LoginPage.class);
                 startActivity(intentUserLogin);
             }
         });

         mButtonSignupShipper.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intentshipperSignup = new Intent(UserRegistrationForm.this,ShipperRegistrationForm.class);
                 startActivity(intentshipperSignup);
             }
         });
    }
}
