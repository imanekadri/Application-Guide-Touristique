package com.example.aninterface;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class main_hotel extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_tout); // Make sure this is your hotel layout

        ArrayList<all> hotelList = new ArrayList<>();
        hotelList.add(new all(R.string.text_hotel1, R.drawable.four_season_hotel ,"$100"));
        hotelList.add(new all(R.string.text_hotel2, R.drawable.espace_hotel,"$300"));
        hotelList.add(new all(R.string.text_hotel3, R.drawable.rsye_hotel,"£160"));
        hotelList.add(new all(R.string.text_hotel4, R.drawable.signiel,"£900"));
        hotelList.add(new all(R.string.text_hotel5, R.drawable.sofiel,"£800"));


        ListView list = findViewById(R.id.list);
        toutAdapter adapter = new toutAdapter(this, hotelList , "hotel");
        list.setAdapter(adapter);


    }
}