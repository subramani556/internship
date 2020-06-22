package com.example.cosc_internship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num,usname,email,npass,cpass;
    TextView textView2;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num=(EditText)findViewById(R.id. editTextNumber);
        usname=(EditText)findViewById(R.id.editTextTextPersonName2);
        email=(EditText)findViewById(R.id.editTextTextEmailAddress);
        npass=(EditText)findViewById(R.id.editTextTextPassword) ;
        cpass=(EditText)findViewById(R.id.editTextTextPassword2);
        btn = (Button) findViewById((R.id.button));


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();


            }
        });
    }
    public void openActivity2() {
        Intent intent=new Intent(this,Activity2.class);
        startActivity(intent);





    }

}