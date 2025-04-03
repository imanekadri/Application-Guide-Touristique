package com.example.aninterface;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ImageView hotelIcon , resturantIcon , gardonIcon , chineseIcon , backIcon ;
    TextView seehotel , seeResturant,seeGardon,seechinese;
    ListView list ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        hotelIcon = (ImageView)findViewById(R.id.hotel_icon);
        resturantIcon = (ImageView)findViewById(R.id.restaurant_icon);
        gardonIcon = (ImageView)findViewById(R.id.garden_icon);
        chineseIcon =(ImageView) findViewById(R.id.chinese_icon);

        hotelIcon.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity.this, main_hotel.class);
            startActivity(intent);
        });

        resturantIcon.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity.this, main_restaurant.class);
            startActivity(intent);
        });

        gardonIcon.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity.this, main_Garden.class);
            startActivity(intent);
        });

        chineseIcon.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity.this, main_hotel.class);
            startActivity(intent);
        });




        seehotel =(TextView)findViewById(R.id.seeHotel);
        seeResturant =(TextView)findViewById(R.id.seeResurant);
        seeGardon =(TextView)findViewById(R.id.seegarden);
        seechinese =(TextView)findViewById(R.id.seeChin);

        seehotel.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity.this, main_hotel.class);
            startActivity(intent);
        });

        seeResturant.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity.this, main_restaurant.class);
            startActivity(intent);
        });

        seeGardon.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity.this, main_Garden.class);
            startActivity(intent);
        });

        seechinese.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity.this, main_hotel.class);
            startActivity(intent);
        });











//        ImageView backIcon = findViewById(R.id.back_icon);
//
//        backIcon.setOnClickListener(v -> {
//            // Handle back navigation
//            onBackPressed(); // This will close the current activity
//        });



    }


}