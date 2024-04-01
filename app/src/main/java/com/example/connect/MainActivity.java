package com.example.connect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {
    TextInputEditText textInputEditTextfullname,textInputEditTextusername,textInputEditTextpassword,textInputEditTextemail;
    TextView signupview;
    MaterialButton signupbutton,backtohomebutton;

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signupbutton= findViewById(R.id.submitbuttongp);
        backtohomebutton = findViewById(R.id.backbuttongp);
        signupview=findViewById(R.id.banner);

        textInputEditTextfullname= findViewById(R.id.c_name1);
        textInputEditTextusername= findViewById(R.id.phonenum);
        textInputEditTextpassword= findViewById(R.id.idnumber);
        textInputEditTextemail= findViewById(R.id.c_email);

        progressBar=findViewById(R.id.progress);


    }
}