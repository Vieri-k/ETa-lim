package com.example.e_talim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    //Tuntunan Shalat Button
    public void bounce(View view) {
        Button btn3  = (Button)findViewById(R.id.button);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        btn3.startAnimation(animation);

        Intent intent = new Intent(getApplicationContext(),TuntunanShalat.class);
        startActivity(intent);
    }

    //Iqra button
    public void bounce1(View view) {
        Button btn3  = (Button)findViewById(R.id.button1);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        btn3.startAnimation(animation);

        Intent intent = new Intent(getApplicationContext(),Iqra.class);
        startActivity(intent);
    }

    //Qiraatul Qur'an Button
    public void bounce2(View view) {
        Button btn3  = (Button)findViewById(R.id.button2);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        btn3.startAnimation(animation);

        Intent intent = new Intent(getApplicationContext(),QiraatulQUran.class);
        startActivity(intent);
    }

    //Tajwid Button
    public void bounce3(View view) {
        Button btn = (Button)findViewById(R.id.button3);

        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        btn.startAnimation(animation);

        Intent intent = new Intent(getApplicationContext(),tajwid.class);
        startActivity(intent);
    }
}
