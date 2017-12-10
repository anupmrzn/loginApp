package com.example.anupmrzn.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tittle;
    private EditText email,password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=(EditText)findViewById(R.id.email_address);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valid();

            }
        });

    }

    private void validate(){
        if  ((email.equals("anup"))&& (password.equals("1234")));
        Toast.makeText(this, "welcome", Toast.LENGTH_SHORT).show();

    }


  private void valid(){
        Intent intent = new Intent(MainActivity.this,secondactivity.class);
        startActivity(intent);

    }

}
