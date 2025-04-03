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
        gardenList.add(new all("Namsan Outdoor", R.drawable.namsan_jadrn,"£100"));
        gardenList.add(new all("Namsan Park", R.drawable.nassaln_jardan ,"£500"));
        gardenList.add(new all("Seoul Children's", R.drawable.seoul_child_gar,"£250"));
        gardenList.add(new all("Wonjomanlgobchang.", R.drawable.wonjomanlgobchang,"£100"));
        gardenList.add(new all("Mukshidonna Samcheongdong", R.drawable.mukshidonn,"£400"));


        ListView list = findViewById(R.id.list);
        toutAdapter adapter = new toutAdapter(this, gardenList);
        list.setAdapter(adapter);


    }
}
