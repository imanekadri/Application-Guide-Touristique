package com.example.aninterface;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class main_restaurant  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_tout); // Make sure this is your hotel layout

        ArrayList<all> restaurantList = new ArrayList<>();
        restaurantList.add(new all("Doal Charcoal Grill", R.drawable.daol_res,"£100"));
        restaurantList.add(new all("Flavors", R.drawable.flavors_res,"£600"));
        restaurantList.add(new all("Odarijip Myeondong", R.drawable.odarijip_res,"£109"));
        restaurantList.add(new all("Wonjomanlgobchang.", R.drawable.wonjomanlgobchang,"£500"));
        restaurantList.add(new all("Mukshidonna Samcheongdong", R.drawable.mukshidonn,"£100"));


        ListView list = findViewById(R.id.list);
        toutAdapter adapter = new toutAdapter(this, restaurantList);
        list.setAdapter(adapter);


    }
}
