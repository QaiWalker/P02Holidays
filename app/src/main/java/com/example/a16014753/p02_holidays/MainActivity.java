package com.example.a16014753.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Categories> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = findViewById(R.id.listViewCat);

        categories = new ArrayList<Categories>();

        categories.add(new Categories("Secular"));
        categories.add(new Categories("Islamic"));

        aa = new CategoriesAdapter(this,R.layout.firstrow,categories);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0){
                    Intent in = new Intent(MainActivity.this, SecularActivity.class);
                    startActivityForResult(in, 0);
                }

                if (i == 1) {
                    Intent in = new Intent(MainActivity.this, IslamicActivity.class);
                    startActivityForResult(in, 0);
                }





            }
        });

    }
}
