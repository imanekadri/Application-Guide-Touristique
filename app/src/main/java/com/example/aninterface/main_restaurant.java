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
        restaurantList.add(new all(R.string.text_restaurant1, R.drawable.daol_res,"£100"));
        restaurantList.add(new all(R.string.text_restaurant2, R.drawable.flavors_res,"£600"));
        restaurantList.add(new all(R.string.text_restaurant3, R.drawable.odarijip_res,"£109"));
        restaurantList.add(new all(R.string.text_restaurant4, R.drawable.wonjomanlgobchang,"£500"));
        restaurantList.add(new all(R.string.text_restaurant5, R.drawable.mukshidonn,"£100"));


        ListView list = findViewById(R.id.list);
        toutAdapter adapter = new toutAdapter(this, restaurantList , "restaurant");
        list.setAdapter(adapter);


    }
}
