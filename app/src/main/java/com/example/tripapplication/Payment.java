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






        v1=findViewById(R.id.e1);
        v1.setText(String.valueOf(((int)payment)));



    }

}