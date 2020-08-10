package com.example.e_talim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class IzharHalqi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_izhar_halqi);
    }

    public void nextIH(View view){
        Button next  = (Button)findViewById(R.id.buttonnextIH);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        next.startAnimation(animation);

        Intent intent = new Intent(getApplicationContext(),idghamBigunnah.class);
        startActivity(intent);
    }
}
