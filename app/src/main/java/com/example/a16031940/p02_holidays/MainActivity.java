package com.example.a16031940.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String>al;
    ArrayAdapter<String>aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        al = new ArrayList<String>();
        al.add("Secular");

        listView = findViewById(R.id.lv);
        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,al);
        listView.setAdapter(aa);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedHoliday = al.get(position);
                Intent I = new Intent(MainActivity.this,Second.class);
                I.putExtra("holiday",selectedHoliday);
                startActivity(I);
                Toast.makeText(MainActivity.this,selectedHoliday,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
