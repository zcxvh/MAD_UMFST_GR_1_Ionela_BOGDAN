package com.example.myapplication.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView textViewMessage;
    private Button buttonReply;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textViewMessage = findViewById(R.id.textViewMessage);
        buttonReply = findViewById(R.id.buttonReply);

        Intent intent = getIntent();
        if (intent != null) {
            String message = intent.getStringExtra("message");
            if (message != null) {
                textViewMessage.setText(message);
            }
        }

        buttonReply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String replyMessage = "Thank you for your message!";
                sendMessage(replyMessage);
            }
        });

    }
    private void sendMessage(String message) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}