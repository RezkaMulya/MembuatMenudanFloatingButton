package com.example.membuatevenact2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_home extends AppCompatActivity {
    TextView emailText, passwordText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        emailText = findViewById(R.id.tf_email);
        passwordText = findViewById(R.id.tf_password);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("data1");
        String password= bundle.getString("data2");

        emailText.setText(email);
        passwordText.setText(password);


    }
}