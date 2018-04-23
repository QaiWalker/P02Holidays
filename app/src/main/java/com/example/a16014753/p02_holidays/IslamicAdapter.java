package com.example.a16014753.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class IslamicAdapter extends ArrayAdapter<Islamic> {
    private ArrayList<Islamic> islamic;
    private Context context;
    private TextView tvName;
    private TextView tvDate;
    private ImageView ivPic;

    public IslamicAdapter(Context context, int resource,
                          ArrayList<Islamic> objects){
        super(context, resource, objects);
        islamic = objects;
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.islamicrow, parent, false);

        tvName = rowView.findViewById(R.id.textViewName);
        tvDate = rowView.findViewById(R.id.textViewDate);
        ivPic = (ImageView) rowView.findViewById(R.id.imageView2);
        Islamic currentIslamic = islamic.get(position);

        tvName.setText(currentIslamic.getName());
        tvDate.setText(currentIslamic.getDate());

        if(currentIslamic.isPic()) {

            ivPic.setImageResource(R.drawable.harirayapuasa);
        }
        else {
            ivPic.setImageResource(R.drawable.harirayahaji);
        }

        return rowView;
    }

}
