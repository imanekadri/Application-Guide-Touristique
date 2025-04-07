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

        ArrayList<all> templeList = new ArrayList<>();
        templeList.add(new all("Hwagyesa", R.drawable.temple1,"£10"));
        templeList.add(new all("Bongwonsal", R.drawable.temple2 ,"£50"));
        templeList.add(new all("Jogyesa", R.drawable.temple3,"£25"));
        templeList.add(new all("Bonjeunsa", R.drawable.temple4,"£10"));
        templeList.add(new all("Myeong-dong Cathedral", R.drawable.temple5,"£100"));


        ListView list = findViewById(R.id.list);
        toutAdapter adapter = new toutAdapter(this, templeList , "temple");
        list.setAdapter(adapter);


    }
}
