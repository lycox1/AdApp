package com.e4deen.adapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Intro extends AppCompatActivity {

    int introDelay = 2 * 1000;
    Handler mHandler;
    Runnable mRunable;

    private static final String LOG_TAG = "AdApplication_Intro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        getSupportActionBar().hide();

        mRunable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Intro.this, MainActivity.class);
                startActivity(intent);
            }
        };

        mHandler = new Handler();
        mHandler.postDelayed(mRunable, introDelay);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG_TAG, "onDestroy()");
        finish();
    }

    @Override
    protected void onDestroy() {
        Log.i(LOG_TAG, "onDestroy()");
        mHandler.removeCallbacks(mRunable);
        super.onDestroy();
    }


}
