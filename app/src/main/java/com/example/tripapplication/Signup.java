package com.example.tripapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Signup extends AppCompatActivity {
    EditText fName,mail,pass,ph;
    Toolbar t2;
    Button register;
    TextView login;
    ProgressBar pbar;
    FirebaseAuth Auth;
    FirebaseFirestore fstore;
    String userid;
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

        fstore=FirebaseFirestore.getInstance();

        t2=findViewById(R.id.toolbar2);
        setSupportActionBar(t2);


        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=mail.getText().toString().trim();
                String password=pass.getText().toString().trim();
                String name= fName.getText().toString();
                String phone=ph.getText().toString();
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
                            Toast.makeText(Signup.this,"Sign Up Successfull !",Toast.LENGTH_SHORT).show();
                            userid=Auth.getCurrentUser().getUid();
                            DocumentReference documentReference=fstore.collection("users").document(userid);
                            Map<String,Object> user= new HashMap<>();
                            user.put("fname",name);
                            user.put("mail",email);
                            user.put("ph",phone);
                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                    Log.d("","onSuccess: user profile is created for"+userid);
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Log.d("","OnFailure"+e.toString());
                                }
                            });

                            Intent i=new Intent(Signup.this,Login.class);
                            startActivity(i);
                        }
                        else
                        {
                            Toast.makeText(Signup.this,"Error !"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                            pbar.setVisibility(View.GONE);
                        }
                    }
                });

            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Signup.this,Login.class);
                startActivity(i);
            }
        });
    }
}