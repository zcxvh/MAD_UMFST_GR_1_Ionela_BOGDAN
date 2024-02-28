package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonCounter;
    private Button buttonToast;
    private TextView textView;
    private TextView textViewCounter;
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCounter=(Button)findViewById(R.id.button9);
        textView=(TextView)findViewById(R.id.textView3);

        buttonToast=(Button)findViewById(R.id.button10);
        textViewCounter=(TextView)findViewById(R.id.textView4);

        buttonCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count +=1;
                textView.setText(String.valueOf(count));
                //textView.setText((""+count));
                textViewCounter.setText("Butonul de count a fost apasat");
            }

        });

        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Succes!!", Toast.LENGTH_SHORT).show();
            }
        });

    }



}