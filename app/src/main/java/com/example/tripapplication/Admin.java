package com.example.tripapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Admin extends AppCompatActivity {
    Toolbar t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        t3=findViewById(R.id.toolbar4);
        setSupportActionBar(t3);
    }
}