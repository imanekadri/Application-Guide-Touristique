package com.example.aninterface;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {


    ImageView hotelIcon , resturantIcon , gardonIcon , chineseIcon , cardHotel1 ,  cardHotel2 , cardHotel3 , cardres1,cardres2,cardres3 , cardgarden1 , cardgarden2,cardgarden3 , cardtemple1 , cardtemple2,cardtemple3;
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
            Intent intent = new Intent(MainActivity2.this, main_hotel.class);
            startActivity(intent);
        });

        resturantIcon.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, main_restaurant.class);
            startActivity(intent);
        });

        gardonIcon.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, main_Garden.class);
            startActivity(intent);
        });

        chineseIcon.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, main_temple.class);
            startActivity(intent);
        });




        seehotel =(TextView)findViewById(R.id.seeHotel);
        seeResturant =(TextView)findViewById(R.id.seeResurant);
        seeGardon =(TextView)findViewById(R.id.seegarden);
        seechinese =(TextView)findViewById(R.id.seeChin);

        seehotel.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, main_hotel.class);
            startActivity(intent);
        });

        seeResturant.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, main_restaurant.class);
            startActivity(intent);
        });

        seeGardon.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, main_Garden.class);
            startActivity(intent);
        });

        seechinese.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, main_temple.class);
            startActivity(intent);
        });





        cardHotel1 = (ImageView)findViewById(R.id.card_Hotel1);
        cardHotel2 = (ImageView)findViewById(R.id.card_Hotel2);
        cardHotel3 = (ImageView)findViewById(R.id.card_Hotel3);


        cardHotel1.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, hotel1.class);
            startActivity(intent);
        });




        cardHotel2.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, hotel2.class);
            startActivity(intent);
        });



        cardHotel3.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, hotel3.class);
            startActivity(intent);
        });



        cardres1=(ImageView) findViewById(R.id.card_resl1);
        cardres2=(ImageView)findViewById(R.id.card_resl2);
        cardres3=(ImageView)findViewById(R.id.card_resl3);

        cardres1.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, restaurant1.class);
            startActivity(intent);
        });

        cardres2.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, restaurant2.class);
            startActivity(intent);
        });

        cardres3.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, restaurant3.class);
            startActivity(intent);
        });

        cardgarden1=(ImageView) findViewById(R.id.card_garden1);
        cardgarden2=(ImageView) findViewById(R.id.card_garden2);
        cardgarden3=(ImageView) findViewById(R.id.card_garden3);

        cardgarden1.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, garden1.class);
            startActivity(intent);
        });

        cardgarden2.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, garden2.class);
            startActivity(intent);
        });

        cardgarden3.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, garden3.class);
            startActivity(intent);
        });

        cardtemple1=(ImageView) findViewById(R.id.card_temple1);
        cardtemple2=(ImageView) findViewById(R.id.card_temple2);
        cardtemple3=(ImageView) findViewById(R.id.card_temple3);

        cardtemple1.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, temple1.class);
            startActivity(intent);
        });

        cardtemple2.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, temple2.class);
            startActivity(intent);
        });

        cardtemple3.setOnClickListener(v -> {
            // Create an Intent to start a new Activity that will show the list
            Intent intent = new Intent(MainActivity2.this, temple3.class);
            startActivity(intent);
        });

    }


}