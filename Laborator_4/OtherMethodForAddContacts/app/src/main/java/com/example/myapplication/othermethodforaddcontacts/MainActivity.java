package com.example.myapplication.othermethodforaddcontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNam;
    private EditText editTextNumbe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing UI elements
        editTextNam=findViewById(R.id.editTextName);
        editTextNumbe=findViewById(R.id.editTextNumber);
    }

    public void btnAddContact(View view) {
        String name = editTextNam.getText().toString().trim();
        String number = editTextNumbe.getText().toString().trim();

        if (!name.isEmpty() && !number.isEmpty()) {
            Intent intent = new Intent(Intent.ACTION_INSERT);
            intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
            intent.putExtra(ContactsContract.Intents.Insert.NAME, name);
            intent.putExtra(ContactsContract.Intents.Insert.PHONE, number);
            startActivity(intent);
        }
    }
}