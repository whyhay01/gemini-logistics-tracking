package com.example.startnglogistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserRegistrationForm extends AppCompatActivity {

    Button mButtonRegisterUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration_form);

         mButtonRegisterUser = findViewById(R.id.btn_register_user);


         mButtonRegisterUser.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intentUserLogin = new Intent(UserRegistrationForm.this, LoginPage.class);
                 startActivity(intentUserLogin);
             }
         });

    }
}
