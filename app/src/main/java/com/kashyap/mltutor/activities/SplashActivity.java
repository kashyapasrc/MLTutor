package com.kashyap.mltutor.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.kashyap.mltutor.R;

public class SplashActivity extends AppCompatActivity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                navigateToMainActivity();
            }
        }, 600);
    }

    private void navigateToMainActivity() {
        Intent intent=MainActivity.getIntentWithNewTask(this);
        startActivity(intent);
        finish();
    }

    public void onStart() {
        super.onStart();
    }


    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void onStop() {
        super.onStop();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onBackPressed() {
        super.onBackPressed();
    }
}
