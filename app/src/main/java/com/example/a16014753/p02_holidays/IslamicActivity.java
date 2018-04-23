package com.example.a16014753.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class IslamicActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Islamic> islamic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islamic);

        ListView lv = findViewById(R.id.listViewIslamic);
        TextView tvTitle = findViewById(R.id.textViewIslamic);
        TextView tvName = findViewById(R.id.textViewName);
        TextView tvDate = findViewById(R.id.textViewDate);

        Intent ins = getIntent();

        islamic = new ArrayList<Islamic>();

        islamic.add(new Islamic("Hari Raya Puasa", "15 June 2017", true));
        islamic.add(new Islamic("Hari Raya Haji", "22 August 2017", false));

        aa = new IslamicAdapter(this,R.layout.islamicrow,islamic);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Islamic selectedIslamic = islamic.get(position);

                Toast.makeText(IslamicActivity.this, selectedIslamic.getName()
                        + ": " + selectedIslamic.getDate(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
