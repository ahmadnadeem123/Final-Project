package com.example.tripapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;

public class BookPage extends AppCompatActivity {

    Toolbar t1;
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2, menu);
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
        setContentView(R.layout.activity_book_page);

        t1=findViewById(R.id.toolbar);
        setSupportActionBar(t1);


        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
    }
}