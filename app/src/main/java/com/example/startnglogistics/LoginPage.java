package com.example.startnglogistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {
    Button mButtonForgetPassword;
    Button mButtonNewUser;
    Button mButtonSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        mButtonNewUser = findViewById(R.id.btn_new_user);
        mButtonSignin = findViewById(R.id.btn_sign_in);


        mButtonNewUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewUser = new Intent(LoginPage.this, LandingPage.class);
                startActivity(intentNewUser);
                finish();
            }
        });

        mButtonSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentusersignin = new Intent(LoginPage.this, HomePageUser.class);
                startActivity(intentusersignin);
                finish();
            }
        });
    }
}
