package com.example.e_talim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class tajwid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajwid);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //  implementasi card 1
    public void bab1 (View view){
        CardView cardView  = (CardView) findViewById(R.id.cardSatu);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        cardView.startAnimation(animation);

        Intent intent = new Intent(getApplicationContext(),Bab1Tajwid.class);
        startActivity(intent);
    }

    //  implementasi card 2
    public void bab2 (View view){
        CardView cardView  = (CardView) findViewById(R.id.cardDua);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        cardView.startAnimation(animation);

//        Intent intent = new Intent(getApplicationContext(),Bab1Tajwid.class);
//        startActivity(intent);
    }

    //  implementasi card 3
    public void bab3 (View view){
        CardView cardView  = (CardView) findViewById(R.id.cardTiga);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        cardView.startAnimation(animation);

//        Intent intent = new Intent(getApplicationContext(),Bab1Tajwid.class);
//        startActivity(intent);
    }

    //  implementasi card 4
    public void bab4 (View view){
        CardView cardView  = (CardView) findViewById(R.id.cardEmpat);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        cardView.startAnimation(animation);

//        Intent intent = new Intent(getApplicationContext(),Bab1Tajwid.class);
//        startActivity(intent);
    }

    //  implementasi card 5
    public void bab5 (View view){
        CardView cardView  = (CardView) findViewById(R.id.cardLima);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        cardView.startAnimation(animation);

//        Intent intent = new Intent(getApplicationContext(),Bab1Tajwid.class);
//        startActivity(intent);
    }

    //  implementasi card 6
    public void bab6 (View view){
        CardView cardView  = (CardView) findViewById(R.id.cardEnam);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        cardView.startAnimation(animation);

//        Intent intent = new Intent(getApplicationContext(),Bab1Tajwid.class);
//        startActivity(intent);
    }

    //  implementasi card 7
    public void bab7 (View view){
        CardView cardView  = (CardView) findViewById(R.id.cardTujuh);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        cardView.startAnimation(animation);

//        Intent intent = new Intent(getApplicationContext(),Bab1Tajwid.class);
//        startActivity(intent);
    }
    //  implementasi card 8
    public void bab8 (View view){
        CardView cardView  = (CardView) findViewById(R.id.cardDelapan);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        cardView.startAnimation(animation);

//        Intent intent = new Intent(getApplicationContext(),Bab1Tajwid.class);
//        startActivity(intent);
    }

    //  implementasi card 9
    public void bab9 (View view){
        CardView cardView  = (CardView) findViewById(R.id.cardSembilan);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        cardView.startAnimation(animation);

//        Intent intent = new Intent(getApplicationContext(),Bab1Tajwid.class);
//        startActivity(intent);
    }
    //  implementasi card 10
    public void bab10 (View view){
        CardView cardView  = (CardView) findViewById(R.id.cardSepuluh);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        cardView.startAnimation(animation);

//        Intent intent = new Intent(getApplicationContext(),Bab1Tajwid.class);
//        startActivity(intent);
    }

    //  implementasi card 11
    public void bab11 (View view){
        CardView cardView  = (CardView) findViewById(R.id.cardSebelas);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        cardView.startAnimation(animation);

//        Intent intent = new Intent(getApplicationContext(),Bab1Tajwid.class);
//        startActivity(intent);
    }

    //  implementasi card 12
    public void bab12 (View view){
        CardView cardView  = (CardView) findViewById(R.id.cardDuabelas);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);
        cardView.startAnimation(animation);

//        Intent intent = new Intent(getApplicationContext(),Bab1Tajwid.class);
//        startActivity(intent);
    }

}
