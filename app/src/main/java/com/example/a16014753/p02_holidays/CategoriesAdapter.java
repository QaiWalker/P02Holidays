package com.example.a16014753.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoriesAdapter extends ArrayAdapter<Categories> {
    private ArrayList<Categories> categories;
    private Context context;
    private TextView tvName;


    public CategoriesAdapter(Context context, int resource,
                          ArrayList<Categories> objects){
        super(context, resource, objects);
        categories = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.firstrow, parent, false);

        tvName = rowView.findViewById(R.id.textViewCat);
        Categories currentCourse = categories.get(position);

        tvName.setText(currentCourse.getCategory());

        return rowView;
    }
}
