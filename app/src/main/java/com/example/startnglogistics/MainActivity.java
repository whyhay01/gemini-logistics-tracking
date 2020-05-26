package com.example.startnglogistics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    //Variables
    Animation topAnimation;
    Animation bottomAnimation;
    ImageView img_logo;
    TextView txt_company_name;
    TextView txt_log_tracking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Animation
        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        img_logo = findViewById(R.id.img_logo);
        txt_company_name = findViewById(R.id.txt_company_name);
        txt_log_tracking = findViewById(R.id.txt_log_tracking);

        //Setting Animation
        img_logo.setAnimation(topAnimation);
        txt_company_name.setAnimation(bottomAnimation);
        txt_log_tracking.setAnimation(bottomAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent_landing_page = new Intent(MainActivity.this,LandingPage.class);
                startActivity(intent_landing_page);
                finish();
            }
        }, SPLASH_SCREEN);
    }
}
