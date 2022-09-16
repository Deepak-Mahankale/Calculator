package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editTextNumber);
        e2=findViewById(R.id.editTextNumber2);
        e3=findViewById(R.id.editTextNumber3);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(e1.getText().toString());
                int num2=Integer.parseInt(e2.getText().toString());
                int total=num1+num2;
                e3.setText("Addition is: "+Integer.toString(total));
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(e1.getText().toString());
                int num2=Integer.parseInt(e2.getText().toString());
                int total=num1-num2;
                e3.setText("Subtraction is: "+Integer.toString(total));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(e1.getText().toString());
                int num2=Integer.parseInt(e2.getText().toString());
                int total=num1*num2;
                e3.setText("Multiplication is: "+Integer.toString(total));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(e1.getText().toString());
                int num2=Integer.parseInt(e2.getText().toString());
                int total=num1/num2;

                e3.setText("Division is: "+Integer.toString(total));
            }
        });
    }

    /*
    public void Add(View v){
        EditText e1,e2,e3;
        e1=findViewById(R.id.editTextNumber);
        e2=findViewById(R.id.editTextNumber2);
        e3=findViewById(R.id.editTextNumber3);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());
        int total=num1+num2;
        e3.setText("Addition is:"+total);
    }
    public void Sub(View v){
        EditText e1,e2,e3;
        e1=findViewById(R.id.editTextNumber);
        e2=findViewById(R.id.editTextNumber2);
        e3=findViewById(R.id.editTextNumber3);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());
        int total=num1-num2;
        e3.setText("Subtraction is:"+total);
    }
    public void mul(View v){
        EditText e1,e2,e3;
        e1=findViewById(R.id.editTextNumber);
        e2=findViewById(R.id.editTextNumber2);
        e3=findViewById(R.id.editTextNumber3);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());
        int total=num1*num2;
        e3.setText("Multiplication is:"+total);
    }
    public void divide(View v){
        EditText e1,e2,e3;
        e1=findViewById(R.id.editTextNumber);
        e2=findViewById(R.id.editTextNumber2);
        e3=findViewById(R.id.editTextNumber3);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());
        int total=num1/num2;
        e3.setText("Division is:"+total);
    }

     */
}