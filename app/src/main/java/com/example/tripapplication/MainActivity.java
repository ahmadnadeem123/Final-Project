package com.example.tripapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
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

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.pract:
//                Intent obj = new Intent(MainActivity.this, Practice.class);
//                startActivity(obj);
//                break;
//
//            case R.id.quiz:
//                Random rand = new Random();
//                int ran = rand.nextInt(4);
//                Intent objj = new Intent(MainActivity.this, Quiz_1.class);
//                objj.putExtra("value", (String.valueOf(ran)));
//                startActivity(objj);
//                break;
//
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//        return false;
//    }


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