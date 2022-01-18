package com.example.tripapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Toolbar t1;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent obj = new Intent(MainActivity.this, About.class);
                startActivity(obj);
                break;

            case R.id.book:
                Intent objj = new Intent(MainActivity.this, BookPage.class);
                startActivity(objj);
                break;

            case R.id.contact:
                Intent obj3 = new Intent(MainActivity.this, Contact.class);
                startActivity(obj3);
                break;


            default:
                return super.onOptionsItemSelected(item);
        }
        return false;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.toolbar);

        setSupportActionBar(t1);
        b1=findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent obj=new Intent(MainActivity.this, BookPage.class);
                startActivity(obj);

            }
        });
    }
}