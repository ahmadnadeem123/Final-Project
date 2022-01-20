package com.example.tripapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;

    ActionBarDrawerToggle toggle;




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





        navigationView=findViewById(R.id.nav_view);
        drawerLayout=findViewById(R.id.drawer);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,t1,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId()) {
                    case R.id.book:
                        Intent intent = new Intent(MainActivity.this, BookPage.class);
                        startActivity(intent);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.contact:
                        Intent intent2 = new Intent(MainActivity.this, Contact.class);
                        startActivity(intent2);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.about:
                        Intent intent3 = new Intent(MainActivity.this, About.class);
                        startActivity(intent3);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                }
                return true;
            }
        });








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