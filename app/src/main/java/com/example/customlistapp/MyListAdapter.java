package com.example.customlistapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static com.example.customlistapp.R.id.text;

public class MyListAdapter  extends ArrayAdapter<String> {
    Activity  context;
    Integer allimages[];
    String alltitle[];
    public MyListAdapter(Activity context, String[] alltitle  ,Integer[] allimages) {
        super(context,R.layout.list_row,alltitle);


        this.context = context;
        this.allimages = allimages;
        this.alltitle = alltitle;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflator=context.getLayoutInflater();
        @SuppressLint("ViewHolder") View rowview=inflator.inflate(R.layout.list_row, null,true);
        ImageView imageView=(ImageView)rowview.findViewById (R.id.image);




        imageView.setImageResource (allimages[position]);
        return rowview;


    }
}
