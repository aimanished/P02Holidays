package com.example.a16031940.p02_holidays;

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

public class Second extends AppCompatActivity {

    ListView lv;
    TextView tvCategory;
    ArrayList<PublicHoliday> publicHolidays;
    ArrayAdapter AA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        lv = (ListView)findViewById(R.id.lv);
        tvCategory = (TextView)findViewById(R.id.textView);
        Intent I = getIntent();
        String category = I.getStringExtra("holiday");
        tvCategory.setText(category);

        publicHolidays = new ArrayList<PublicHoliday>();


        if(category.equalsIgnoreCase("secular")){
            publicHolidays.add(new PublicHoliday("newyear","1/1/18"));
            publicHolidays.add(new PublicHoliday("labourday","1/5/18"));

        }else {
            publicHolidays.add(new PublicHoliday("nskjad", "sad"));
            publicHolidays.add(new PublicHoliday("nskjad", "sad"));
        }
        AA = new PublicHolidayAdapter(this,R.layout.row ,publicHolidays);

        lv.setAdapter(AA);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getBaseContext(),publicHolidays.get(position).getHoliday() + " " + publicHolidays.get(position).getDate() , Toast.LENGTH_SHORT).show();

            }
        });

    }
}
