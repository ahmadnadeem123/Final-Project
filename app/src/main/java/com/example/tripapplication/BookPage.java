package com.example.tripapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class BookPage extends AppCompatActivity {

    Toolbar t1;

    DatePickerDialog picker;
    EditText eText;
    TextView tvw;
    EditText no;
    DatePickerDialog picker1;
    EditText eText1;
    EditText noofperson;
    EditText noofdays;
    Spinner depto;
    Spinner depfrom;
    Spinner accom;
    Button b1;


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

        noofperson=findViewById(R.id.editTextNumber);
        depto=findViewById(R.id.spinner3);
        depfrom=findViewById(R.id.spinner);
        accom=findViewById(R.id.spinner4);
        no=findViewById(R.id.editTextNumber);
        noofdays=findViewById(R.id.editTextNumber2);


        String departureto = depto.getSelectedItem().toString();
        String departurefrom = depfrom.getSelectedItem().toString();
        String accomodation = accom.getSelectedItem().toString();
        String persons= noofperson.getText().toString();







        tvw=(TextView)findViewById(R.id.textView5);
        eText=(EditText) findViewById(R.id.editText1);
        eText.setInputType(InputType.TYPE_NULL);
        eText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                picker = new DatePickerDialog(BookPage.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                eText.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });
//        btnGet=(Button)findViewById(R.id.button1);
//        btnGet.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tvw.setText("Selected Date: "+ eText.getText());
//            }
//        });



        eText1=(EditText) findViewById(R.id.editText2);
        eText1.setInputType(InputType.TYPE_NULL);
        eText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                picker1 = new DatePickerDialog(BookPage.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                eText1.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker1.show();
            }
        });


         b1=findViewById(R.id.button2);
         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                 Intent obj=new Intent(BookPage.this, Payment.class);
                 obj.putExtra("deptto",depto.getSelectedItem().toString() );
                 obj.putExtra("deptfrom",depfrom.getSelectedItem().toString()  );
                 obj.putExtra("accom", accom.getSelectedItem().toString());
                 obj.putExtra("person",no.getText().toString());
                 obj.putExtra("checkin",eText.getText().toString() );
                 obj.putExtra("checkout",eText1.getText().toString() );
                 obj.putExtra("days",noofdays.getText().toString() );
                 startActivity(obj);



             }
         });




    }
}