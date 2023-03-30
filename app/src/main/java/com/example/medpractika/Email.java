package com.example.medpractika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Email extends AppCompatActivity {
EditText em1,em2,em3,em4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        em1 = findViewById(R.id.email1);
        em2 = findViewById(R.id.email2);
        em3 = findViewById(R.id.email3);
        em4 = findViewById(R.id.email4);
    }

    public void back(View view) {
        Intent intent = new Intent(Email.this, Authorization.class);
        startActivity(intent);
    }
}