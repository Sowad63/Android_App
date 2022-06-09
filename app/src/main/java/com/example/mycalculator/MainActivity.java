package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Num_1, Num_2,  Result;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button adv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num_1 = findViewById(R.id.Num_1);
        Num_2 = findViewById(R.id.Num_2);
        Result = findViewById(R.id.Result);
        btn1 = findViewById(R.id.Add);
        adv = findViewById(R.id.adv);
        btn2 = findViewById(R.id.Sub);
        btn3 = findViewById(R.id.Mul);
        btn4 = findViewById(R.id.Div);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(Num_1.getText().toString());
                int b = Integer.parseInt(Num_2.getText().toString());
                int c = a+b;


                Result.setText(String.valueOf(c));



            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(Num_1.getText().toString());
                int b = Integer.parseInt(Num_2.getText().toString());
                int d = a-b;


                Result.setText(String.valueOf(d));



            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(Num_1.getText().toString());
                int b = Integer.parseInt(Num_2.getText().toString());
                int e = a*b;


                Result.setText(String.valueOf(e));



            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(Num_1.getText().toString());
                int b = Integer.parseInt(Num_2.getText().toString());
                int f = a/b;


                Result.setText(String.valueOf(f));



            }
        });

        adv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
            Advanced_Mode.class);
                        startActivity(myIntent);

            }
        });
    }
}