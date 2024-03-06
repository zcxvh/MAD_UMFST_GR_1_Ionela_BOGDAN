package com.example.myapplication.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnGo(View view) {
        String url="https://www.google.com/";
        Intent intent=new Intent (Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void dialPhoneNumber(View view) {
        String phoneNumber = "1234567890";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
        startActivity(intent);
    }

    public void showMapLocation(View view) {
        String location = "geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(location));
        startActivity(intent);
    }
}