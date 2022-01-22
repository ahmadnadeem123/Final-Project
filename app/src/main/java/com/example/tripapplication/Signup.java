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

public class Signup extends AppCompatActivity {
    EditText fName,mail,pass,ph;
    Button register;
    TextView login;
    ProgressBar pbar;
    FirebaseAuth Auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        register=findViewById(R.id.signup);
        fName=findViewById(R.id.name);
        mail=findViewById(R.id.email);
        pass=findViewById(R.id.password);
        ph=findViewById(R.id.phone);
        login=findViewById(R.id.createtext);
        pbar=findViewById(R.id.progressBar);
        Auth=FirebaseAuth.getInstance();
        if(Auth.getCurrentUser()!=null)
        {
            Intent i=new Intent(Signup.this,Login.class);
            startActivity(i);
            finish();
        }
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=mail.getText().toString().trim();
                String password=pass.getText().toString().trim();

                if(TextUtils.isEmpty(email))
                {
                    mail.setError("Email is Required");
                    return;
                }
                if(TextUtils.isEmpty(password))
                {
                    pass.setError("Password is Required");
                    return;
                }
                if(password.length()<6)
                {
                    pass.setError("Password Must be >= 6 Characters");
                    return;
                }
                pbar.setVisibility(View.VISIBLE);

                Auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(Signup.this,"User Created !",Toast.LENGTH_SHORT).show();
                            Intent i=new Intent(Signup.this,Login.class);
                            startActivity(i);
                        }
                        else
                        {
                            Toast.makeText(Signup.this,"Error !"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });
    }
}