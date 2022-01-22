package com.example.tripapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    EditText mail,pass;
    Button btn;
    TextView createbtn;
    ProgressBar pgbar;
    FirebaseAuth Auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mail=findViewById(R.id.email1);
        pass=findViewById(R.id.password);
        createbtn=findViewById(R.id.createtext);
        pgbar=findViewById(R.id.progressBar2);
        Auth=FirebaseAuth.getInstance();
        btn=findViewById(R.id.signin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mail.getText().toString().trim();
                String password = pass.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    mail.setError("Email is Required");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    pass.setError("Password is Required");
                    return;
                }

                pgbar.setVisibility(View.VISIBLE);

                Auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(Login.this,"Logged In Successfull !",Toast.LENGTH_SHORT).show();
                            Intent i=new Intent(Login.this,BookPage.class);
                            startActivity(i);
                        }
                        else
                        {
                            Toast.makeText(Login.this,"Error !"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();

                        }
                    }
                });



            }

        });
        createbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login.this,Signup.class);
                startActivity(i);
            }
        });
    }
}