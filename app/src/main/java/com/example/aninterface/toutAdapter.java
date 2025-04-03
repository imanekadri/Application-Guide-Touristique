package com.example.aninterface;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class toutAdapter extends BaseAdapter {
    ArrayList<com.example.aninterface.all> all;
    Context context;

    public toutAdapter(Context context, ArrayList<com.example.aninterface.all> books) {
        this.context = context;
        this.all = books;
    }


    @Override
    public int getCount() {
        return all.size();
    }

    @Override
    public Object getItem(int position) {
        return all.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        com.example.aninterface.all alls = all.get(position);



        if (view == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            view = layoutInflater.inflate(R.layout.item_list, null);
        }
        TextView txt_title = view.findViewById(R.id.test_title);
        ImageView image= view.findViewById(R.id.image_pdp);
        TextView text_price = view.findViewById(R.id.price);

        txt_title.setText(alls.title);
        image.setImageResource(alls.imageResource) ;
        text_price.setText(alls.price);





        return view;
    }
}
