package com.example.e_talim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Bab1Tajwid extends AppCompatActivity {
    private static int splash = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab1_tajwid);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    Intent intent = new Intent(Bab1Tajwid.this, IzharHalqi.class);
                    startActivity(intent);
                    finish();
                }
        },splash);
    }
}
