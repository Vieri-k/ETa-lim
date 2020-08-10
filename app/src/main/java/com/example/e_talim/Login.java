package com.example.e_talim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    // Login button
    public void Login (View view) {
        Button btn3  = (Button)findViewById(R.id.log);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        btn3.startAnimation(animation);

        Intent intent = new Intent(getApplicationContext(),Dashboard.class);
        startActivity(intent);
    }

    // Register Button
    public void register (View view){
        Intent intent = new Intent(getApplicationContext(),register.class);
        startActivity(intent);
    }
}
