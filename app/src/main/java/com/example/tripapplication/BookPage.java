package com.example.tripapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class BookPage extends AppCompatActivity {

    Toolbar t1;
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent obj = new Intent(BookPage.this, About.class);
                startActivity(obj);
                break;

            case R.id.contact:
                Intent obj1 = new Intent(BookPage.this, Contact.class);
                startActivity(obj1);
                break;


            default:
                return super.onOptionsItemSelected(item);
        }
        return false;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_page);

        t1=findViewById(R.id.toolbar);
        setSupportActionBar(t1);


        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
    }
}