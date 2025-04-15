package com.example.aninterface;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class main_Garden extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_tout); // Make sure this is your hotel layout

        ArrayList<all> gardenList = new ArrayList<>();
        gardenList.add(new all(R.string.text_graden1, R.drawable.nassaln_jardan,"£100"));
        gardenList.add(new all(R.string.text_graden2, R.drawable.namsan_jadrn  ,"£500"));
        gardenList.add(new all(R.string.text_graden3, R.drawable.seoul_child_gar,"£250"));
        gardenList.add(new all(R.string.text_graden4, R.drawable.garden4,"£100"));
        gardenList.add(new all(R.string.text_graden5, R.drawable.garden5,"£400"));


        ListView list = findViewById(R.id.list);
        toutAdapter adapter = new toutAdapter(this, gardenList , "garden");
        list.setAdapter(adapter);


    }
}
