package com.example.medpractika;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Onboard extends AppCompatActivity {
    ConstraintLayout tab1, tab2, tab3;
    ImageView img1, img2, img3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);
        tab1 = findViewById(R.id.tab1);
        tab2 = findViewById(R.id.tab2);
        tab3 = findViewById(R.id.tab3);
        img1 = findViewById(R.id.check1);
        img2 = findViewById(R.id.check2);
        img3 = findViewById(R.id.check3);
    }

    public void next1(View view) {

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.on_board_anim);
        tab2.setVisibility(View.VISIBLE);
        tab1.startAnimation(animation);
        tab1.setVisibility(View.GONE);
        img1.setImageResource(R.drawable.ellipse2);
        img2.setImageResource(R.drawable.ellipse1);
    }

    public void next2(View view) {

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.on_board_anim);
        tab3.setVisibility(View.VISIBLE);
        tab2.startAnimation(animation);
        tab2.setVisibility(View.GONE);
        img2.setImageResource(R.drawable.ellipse2);
        img3.setImageResource(R.drawable.ellipse1);
    }

    public void next3(View view) {
        Intent intent = new Intent(Onboard.this, Authorization.class);
        startActivity(intent);
    }
}