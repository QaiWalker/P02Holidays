package com.example.a16014753.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecularAdapter extends ArrayAdapter<Secular> {
    private ArrayList<Secular> secular;
    private Context context;
    private TextView tvName;
    private TextView tvDate;
    private ImageView ivPic;

    public SecularAdapter(Context context, int resource,
                          ArrayList<Secular> objects){
        super(context, resource, objects);
        secular = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.secularrow, parent, false);

        tvName = rowView.findViewById(R.id.textViewName);
        tvDate = rowView.findViewById(R.id.textViewDate);
        ivPic = (ImageView) rowView.findViewById(R.id.imageView2);
        Secular currentSecular = secular.get(position);

        tvName.setText(currentSecular.getName());
        tvDate.setText(currentSecular.getDate());

        if(currentSecular.isPic()) {

            ivPic.setImageResource(R.drawable.labourday);
        }
        else {
            ivPic.setImageResource(R.drawable.newyear);
        }

        return rowView;
    }
}
