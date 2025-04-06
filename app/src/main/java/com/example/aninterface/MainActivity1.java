package com.example.aninterface;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    Button getStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_started);

        getStart=(Button)findViewById(R.id.getStarted);

        getStart.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity1.this, MainActivity2.class);
            startActivity(intent);
        });


    }
}
