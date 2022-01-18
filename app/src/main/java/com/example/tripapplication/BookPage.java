package com.example.tripapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class BookPage extends AppCompatActivity {

    Toolbar t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_page);

        t1=findViewById(R.id.toolbar);
        setSupportActionBar(t1);
    }
}