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

public class SecularActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Secular> secular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secular);

        ListView lv = findViewById(R.id.listViewSecular);
        TextView tvTitle = findViewById(R.id.textViewSecular);
        TextView tvName = findViewById(R.id.textViewName);
        TextView tvDate = findViewById(R.id.textViewDate);

        Intent in = getIntent();

        secular = new ArrayList<Secular>();

        secular.add(new Secular("New Years Day", "1 Jan 2017", true));
        secular.add(new Secular("Labour Day", "1 May 2017", false));

        aa = new SecularAdapter(this,R.layout.secularrow,secular);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Secular selectedSecular = secular.get(position);

                Toast.makeText(SecularActivity.this, selectedSecular.getName()
                        + ": " + selectedSecular.getDate(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
