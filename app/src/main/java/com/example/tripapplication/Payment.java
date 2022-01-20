package com.example.tripapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Payment extends AppCompatActivity {


    Toolbar t1;
    TextView v1;
    Button b1;

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent obj = new Intent(Payment.this, About.class);
                startActivity(obj);
                break;

            case R.id.contact:
                Intent obj1 = new Intent(Payment.this, Contact.class);
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
        setContentView(R.layout.activity_payment);

        v1=findViewById(R.id.payment);
        t1=findViewById(R.id.toolbar);
        setSupportActionBar(t1);
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);


        b1=findViewById(R.id.button);

        Intent obj = getIntent();


        String depto = obj.getStringExtra("deptto");
        String deptfrom = obj.getStringExtra("deptfrom");
        String accom = obj.getStringExtra("accom");
        String persons = obj.getStringExtra("person");
        String checkin = obj.getStringExtra("checkin");
        String checkout = obj.getStringExtra("checkout");
        String day = obj.getStringExtra("days");
        int noofday=Integer.parseInt(day);


        float payment = 0;


        if(deptfrom.equals("Lahore") && depto.equals("Hunza"))
        {
            if(accom.equals("Comfort"))
            {
                if(noofday<3)
                {
                    payment = 13000 * Integer.valueOf(persons);
                }
                else
                {
                    payment = (float) (13000 * Integer.valueOf(persons) * noofday/3.5);

                }

            }

            else if(accom.equals("Luxury"))
            {
                if(noofday<3)
                {
                    payment = (float) (13000 * Integer.valueOf(persons) * 1.2);
                }
                else
                {
                    payment = (float) (13000 * Integer.valueOf(persons) * noofday/3.5 * 1.2);

                }
            }

        }

        else if(deptfrom.equals("Multan") && depto.equals("Hunza"))
        {
            if(accom.equals("Comfort"))
            {
                if(noofday<3) {
                    payment = 14000 * Integer.valueOf(persons);
                }
                else
                {
                    payment = (float) (14000 * Integer.valueOf(persons) * noofday/3.5);
                }
            }
            else if(accom.equals("Luxury"))
            {
                if(noofday<3) {

                    payment = (float) (14000 * Integer.valueOf(persons) * 1.2);
                }
                else
                {
                    payment = (float) (14000 * Integer.valueOf(persons) * noofday/3.5 * 1.2);
                }
            }

        }


        else if(deptfrom.equals("Islamabad") && depto.equals("Hunza"))
        {
            if(accom.equals("Comfort"))
            {
                if(noofday<3) {
                    payment = 11000 * Integer.valueOf(persons);
                }
                else
                {
                    payment = (float) (11000 * Integer.valueOf(persons) * noofday/3.5 );
                }


            }
            else if(accom.equals("Luxury"))
            {
                if(noofday<3) {
                    payment = (float) (11000 * Integer.valueOf(persons) * 1.2);
                }
                else
                {
                    payment = (float) (11000 * Integer.valueOf(persons) * noofday/3.5 * 1.2);
                }

            }

        }

        else if(deptfrom.equals("Lahore") && depto.equals("Swat"))
        {
            if(accom.equals("Comfort"))
            {
                if(noofday<3) {
                    payment = 10000 * Integer.valueOf(persons);
                }
                else
                {
                    payment = (float) (10000 * Integer.valueOf(persons) * noofday/3.5 );
                }


            }
            else if(accom.equals("Luxury"))
            {
                if(noofday<3) {
                    payment = (float) (10000 * Integer.valueOf(persons) * 1.2);
                }
                else
                {
                    payment = (float) (10000 * Integer.valueOf(persons) * noofday/3.5 * 1.2);
                }

            }

        }


        else if(deptfrom.equals("Multan") && depto.equals("Swat"))
        {
            if(accom.equals("Comfort"))
            {
                if(noofday<3) {
                    payment = 11000 * Integer.valueOf(persons);
                }
                else
                {
                    payment = (float) (11000 * Integer.valueOf(persons) * noofday/3.5 );
                }


            }
            else if(accom.equals("Luxury"))
            {
                if(noofday<3) {
                    payment = (float) (11000 * Integer.valueOf(persons) * 1.2);
                }
                else
                {
                    payment = (float) (11000 * Integer.valueOf(persons) * noofday/3.5 * 1.2);
                }

            }

        }


        else if(deptfrom.equals("Islamabad") && depto.equals("Swat"))
        {
            if(accom.equals("Comfort"))
            {
                if(noofday<3) {
                    payment = 9000 * Integer.valueOf(persons);
                }
                else
                {
                    payment = (float) (9000 * Integer.valueOf(persons) * noofday/3.5 );
                }


            }
            else if(accom.equals("Luxury"))
            {
                if(noofday<3) {
                    payment = (float) (9000 * Integer.valueOf(persons) * 1.2);
                }
                else
                {
                    payment = (float) (9000 * Integer.valueOf(persons) * noofday/3.5 * 1.2);
                }

            }

        }


        else if(deptfrom.equals("Lahore") && depto.equals("Murree"))
        {
            if(accom.equals("Comfort"))
            {
                if(noofday<3) {
                    payment = 8000 * Integer.valueOf(persons);
                }
                else
                {
                    payment = (float) (8000 * Integer.valueOf(persons) * noofday/3.5 );
                }


            }
            else if(accom.equals("Luxury"))
            {
                if(noofday<3) {
                    payment = (float) (8000 * Integer.valueOf(persons) * 1.2);
                }
                else
                {
                    payment = (float) (8000 * Integer.valueOf(persons) * noofday/3.5 * 1.2);
                }

            }

        }

        else if(deptfrom.equals("Multan") && depto.equals("Murree"))
        {
            if(accom.equals("Comfort"))
            {
                if(noofday<3) {
                    payment = 9000 * Integer.valueOf(persons);
                }
                else
                {
                    payment = (float) (9000 * Integer.valueOf(persons) * noofday/3.5 );
                }


            }
            else if(accom.equals("Luxury"))
            {
                if(noofday<3) {
                    payment = (float) (9000 * Integer.valueOf(persons) * 1.2);
                }
                else
                {
                    payment = (float) (9000 * Integer.valueOf(persons) * noofday/3.5 * 1.2);
                }

            }

        }


        else if(deptfrom.equals("Islamabad") && depto.equals("Murree"))
        {
            if(accom.equals("Comfort"))
            {
                if(noofday<3) {
                    payment = 7000 * Integer.valueOf(persons);
                }
                else
                {
                    payment = (float) (7000 * Integer.valueOf(persons) * noofday/3.5 );
                }


            }
            else if(accom.equals("Luxury"))
            {
                if(noofday<3) {
                    payment = (float) (7000 * Integer.valueOf(persons) * 1.2);
                }
                else
                {
                    payment = (float) (7000 * Integer.valueOf(persons) * noofday/3.5 * 1.2);
                }

            }

        }




     v1.setText(String.valueOf((int)payment));


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Payment.this);
                builder.setMessage("Are you sure to book trip ");
                builder.setTitle("Confirmation");
                builder.setCancelable(false);
                builder.setPositiveButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int asdf)
                            {
                                dialog.cancel();
                            }
                        });
                builder.setNegativeButton(
                        "Yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                Toast toast = Toast.makeText(Payment.this, "Your response submitted. Our Team contact you soon", Toast.LENGTH_LONG);
                                toast.show();

                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {

                                        Intent i=new Intent(Payment.this,MainActivity.class);
                                        startActivity(i);
                                    }
                                }, 3200);


                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();



            }
        });


    }

}