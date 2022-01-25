package com.example.tripapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Admin extends AppCompatActivity {
    Toolbar t3;
    RecyclerView myrview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        t3=findViewById(R.id.toolbar4);
        setSupportActionBar(t3);


    }
}