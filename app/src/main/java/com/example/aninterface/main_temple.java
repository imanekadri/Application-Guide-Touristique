package com.example.aninterface;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class main_temple extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_tout); // Make sure this is your hotel layout

        ArrayList<all> gardenList = new ArrayList<>();
        gardenList.add(new all("Hwagyesa", R.drawable.temple1,"£10"));
        gardenList.add(new all("Bongwonsal", R.drawable.temple2 ,"£50"));
        gardenList.add(new all("Jogyesa", R.drawable.temple3,"£25"));
        gardenList.add(new all("Bonjeunsa", R.drawable.temple4,"£10"));


        ListView list = findViewById(R.id.list);
        toutAdapter adapter = new toutAdapter(this, gardenList , "garden");
        list.setAdapter(adapter);


    }
}
