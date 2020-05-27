package com.example.startnglogistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {
    Button mButtonSignShipper;
    Button mButtonNewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        mButtonSignShipper = findViewById(R.id.btn_sign_in_as_shipper);

        mButtonSignShipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShipperLogin = new Intent(LoginPage.this, LoginPageShipper.class);
                startActivity(intentShipperLogin);
            }
        });

        mButtonNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewUser = new Intent(LoginPage.this, UserRegistrationForm.class);
                startActivity(intentNewUser);
            }
        });
    }
}
