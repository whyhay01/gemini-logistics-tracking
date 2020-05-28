package com.example.startnglogistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShipperRegistrationForm extends AppCompatActivity {

    Button mButtonShipperSignup, mButtonUserSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipper_registration_form);

        mButtonShipperSignup = findViewById(R.id.btn_sign_up_shipper_sp);
        mButtonUserSignup = findViewById(R.id.btn_sign_up_as_user);

        mButtonShipperSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentShipperSigup = new Intent(ShipperRegistrationForm.this, LoginPageShipper.class);
                startActivity(intentShipperSigup);
            }
        });

        Intent intentUserSigup = new Intent(ShipperRegistrationForm.this, UserRegistrationForm.class);
        startActivity(intentUserSigup);
    }
}
