package com.example.startnglogistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupPage extends AppCompatActivity {
    Button mBtnSignUpUser;
    Button mBtnSignUpShipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
        mBtnSignUpUser = findViewById(R.id.btn_user_signup);
        mBtnSignUpShipper = findViewById(R.id.btn_shipper_signup);

        mBtnSignUpUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupUserIntent = new Intent(SignupPage.this, UserRegistrationForm.class);
                startActivity(signupUserIntent);
                finish();
            }
        });

        mBtnSignUpShipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupShipperIntent = new Intent(SignupPage.this, ShipperRegistrationForm.class);
                startActivity(signupShipperIntent);
                finish();
            }
        });
    }
}
