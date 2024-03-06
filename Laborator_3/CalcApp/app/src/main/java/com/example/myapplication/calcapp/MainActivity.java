 package com.example.myapplication.calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

     private double sum;
     double numar1,numar2;
     Button btnAdd;
     Button btnSub;
     Button btnDiv;
     Button btnMult;

     EditText number1;
     EditText number2;
     TextView textViewRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd=(Button)findViewById(R.id.button);
        btnSub=(Button) findViewById(R.id.button3);
        btnDiv=(Button)findViewById(R.id.button2);
        btnMult=(Button)findViewById(R.id.button4);

        number1=(EditText)findViewById(R.id.editTextNumber);
        number2=(EditText)findViewById(R.id.editTextNumber2);
        textViewRes=(TextView)findViewById(R.id.textView2);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Adunare(v);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Scadere(v);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Div(v);
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiplu(v);
            }
        });
    }

    private void Adunare(View view){
        numar1 = Double.parseDouble(number1.getText().toString());
        numar2 = Double.parseDouble(number2.getText().toString());
        double suma = numar1 + numar2;
        textViewRes.setText("Rezultat: " + suma);
    }

    private void Scadere(View view){
        numar1 = Double.parseDouble(number1.getText().toString());
        numar2 = Double.parseDouble(number2.getText().toString());
        double rezultat = numar1 - numar2;
        textViewRes.setText("Rezultat: " + rezultat);
    }
    private void Div(View view){
        numar1 = Double.parseDouble(number1.getText().toString());
        numar2 = Double.parseDouble(number2.getText().toString());
        if(numar1%numar2==0){
            textViewRes.setText("Rezultat: " + numar1+" este divizibil cu "+numar2);
        }
        else{
            textViewRes.setText("Rezultat: " + numar1+" nu este divizibil cu "+numar2);
        }
    }

    private void Multiplu(View view){
        if(numar1%numar2==0){
            textViewRes.setText("Rezultat: " + numar1+" este multiplu lui "+numar2);
        }
        else{
            textViewRes.setText("Rezultat: " + numar1+" nu este multiplu lui "+numar2);
        }
    }
}