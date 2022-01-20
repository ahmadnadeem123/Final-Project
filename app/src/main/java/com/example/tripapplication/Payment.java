package com.example.tripapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Payment extends AppCompatActivity {

    TextView v1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);





        Intent obj = getIntent();
        String depto = obj.getStringExtra("deptto");
        String deptfrom = obj.getStringExtra("deptfrom");
        String accom = obj.getStringExtra("accom");
        String persons = obj.getStringExtra("person");
        String checkin = obj.getStringExtra("checkin");
        String checkout = obj.getStringExtra("checkout");
        String day = obj.getStringExtra("days");









        float payment = 0;
        int comfort=5000;
        int luxury=7000;


        if(deptfrom=="Lahore" && depto=="Hunza")
        {
            if(accom=="Comfort")
            {
                payment = 13000 * Integer.valueOf(persons);
            }
            else if(accom=="Luxury")
            {
                payment = (float) (13000 * Integer.valueOf(persons) * 1.2);
            }

        }

        else if(deptfrom=="Multan" && depto=="Hunza")
        {
            if(accom=="Comfort")
            {
                payment = 14000 * Integer.valueOf(persons);
            }
            else if(accom=="Luxury")
            {
                payment = (float) (14000 * Integer.valueOf(persons) * 1.2);
            }

        }
        else if(deptfrom=="Islamabad" && depto=="Hunza")
        {
            if(accom=="Comfort")
            {
                payment = 11000 * Integer.valueOf(persons);
            }
            else if(accom=="Luxury")
            {
                payment = (float) (11000 * Integer.valueOf(persons) * 1.2);
            }

        }


        else if(deptfrom=="Lahore" && depto=="Swat")
        {
            if(accom=="Comfort")
            {
                payment = 10000 * Integer.valueOf(persons);
            }
            else if(accom=="Luxury")
            {
                payment = (float) (10000 * Integer.valueOf(persons) * 1.2);
            }

        }

        else if(deptfrom=="Multan" && depto=="Swat")
        {
            if(accom=="Comfort")
            {
                payment = 11000 * Integer.valueOf(persons);
            }
            else if(accom=="Luxury")
            {
                payment = (float) (11000 * Integer.valueOf(persons) * 1.2);
            }

        }

        else if(deptfrom=="Islamabad" && depto=="Swat")
        {
            if(accom=="Comfort")
            {
                payment = 90000 * Integer.valueOf(persons);
            }
            else if(accom=="Luxury")
            {
                payment = (float) (90000 * Integer.valueOf(persons) * 1.2);
            }

        }

        else if(deptfrom=="Lahore" && depto=="Murree")
        {
            if(accom=="Comfort")
            {
                payment = 7000 * Integer.valueOf(persons);
            }
            else if(accom=="Luxury")
            {
                payment = (float) (7000 * Integer.valueOf(persons) * 1.2);
            }

        }


        else if(deptfrom=="Multan" && depto=="Murree")
        {
            if(accom=="Comfort")
            {
                payment = 8000 * Integer.valueOf(persons);
            }
            else if(accom=="Luxury")
            {
                payment = (float) (8000 * Integer.valueOf(persons) * 1.2);
            }

        }

        else if(deptfrom=="Islamabad" && depto=="Murree")
        {
            if(accom=="Comfort")
            {
                payment = 6000 * Integer.valueOf(persons);
            }
            else if(accom=="Luxury")
            {
                payment = (float) (6000 * Integer.valueOf(persons) * 1.2);
            }

        }






        v1=findViewById(R.id.e1);
        v1.setText(day);



    }

}