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
    ArrayList<all> alll;
    Context context;
    String category; // Add this field

    public toutAdapter(Context context, ArrayList<all> books, String category) {
        this.context = context;
        this.alll = books;
        this.category = category;
    }


    @Override
    public int getCount() {
        return alll.size();
    }

    @Override
    public Object getItem(int position) {
        return alll.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        all alls = alll.get(position);

        all currentItem = alll.get(position);
        if (view == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            view = layoutInflater.inflate(R.layout.item_list, null);
        }
        TextView txt_title = view.findViewById(R.id.test_title);
        ImageView image = view.findViewById(R.id.image_pdp);
        TextView text_price = view.findViewById(R.id.price);

        txt_title.setText(alls.title);
        image.setImageResource(alls.imageResource);
        text_price.setText(alls.price);


        // جعل العنصر كاملاً قابلاً للنقر
        view.setOnClickListener(v -> {
            Intent intent;
            switch (category) { // Switch based on category instead of position
                case "hotel":
                    intent = getHotelIntent(position);
                    break;
                case "restaurant":
                    intent = getRestaurantIntent(position);
                    break;
//                case "garden":
//                    intent = getGardenIntent(position);
//                    break;
//                case "temple":
//                    intent = getTempleIntent(position);
//                    break;
                default:
                    intent = new Intent(context, MainActivity2.class);
            }


            intent.putExtra("title", currentItem.title);
            intent.putExtra("image", currentItem.imageResource);
            intent.putExtra("price", currentItem.price);
            context.startActivity(intent);
        });

        return view;
    }

    private Intent getHotelIntent(int position) {
        switch (position) {
            case 0:
                return new Intent(context, hotel1.class);
            case 1:
                return new Intent(context, hotel2.class);
            case 2:
                return new Intent(context, hotel3.class);
            case 3:
                return new Intent(context, hotel4.class);
            case 4:
                return new Intent(context, hotel5.class);
            default:
                return new Intent(context, MainActivity2.class);
        }
    }

    private Intent getRestaurantIntent(int position) {
        switch (position) {
            case 0:
                return new Intent(context, restaurant1.class);
            case 1:
                return new Intent(context, restaurant2.class);
            case 2:
                return new Intent(context, restaurant3.class);
            case 3: return new Intent(context, restaurant4.class);
            case 4: return new Intent(context, restaurant5.class);
            default:
                return new Intent(context, MainActivity2.class);
        }
    }

}

//    private Intent getGardenIntent(int position) {
//        switch (position) {
//            case 0: return new Intent(context, garden1.class);
//            case 1: return new Intent(context, garden2.class);
//            case 2: return new Intent(context, garden3.class);
//            default: return new Intent(context, MainActivity2.class);
//        }
//    }
//
//    private Intent getTempleIntent(int position) {
//        switch (position) {
//            case 0: return new Intent(context, temple1.class);
//            case 1: return new Intent(context, temple2.class);
//            case 2: return new Intent(context, temple3.class);
//            default: return new Intent(context, MainActivity2.class);
//        }


    
       