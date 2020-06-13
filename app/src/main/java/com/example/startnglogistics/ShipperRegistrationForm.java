package com.example.startnglogistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShipperRegistrationForm extends AppCompatActivity {

    Button mButtonShipperRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipper_registration_form);

        mButtonShipperRegister = findViewById(R.id.btn_register_shipper);

        mButtonShipperRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerShipperintent = new Intent();
            }
        });
    }
}
