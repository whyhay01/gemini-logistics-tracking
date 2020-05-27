package com.example.startnglogistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPageShipper extends AppCompatActivity {

    Button mButtonSigninUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page_shipper);

        mButtonSigninUser = findViewById(R.id.btn_sign_in_as_user);

        mButtonSigninUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSigninUser =new Intent(LoginPageShipper.this, LoginPage.class);
                startActivity(intentSigninUser);
            }
        });
    }
}
