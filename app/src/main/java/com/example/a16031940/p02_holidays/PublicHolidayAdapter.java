package com.example.a16031940.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PublicHolidayAdapter extends ArrayAdapter<PublicHoliday>{

    Context context;
    ArrayList<PublicHoliday> publicHolidays;
    TextView tvholiday;
    TextView tvDate;
    ImageView imageView;

    public PublicHolidayAdapter(Context context,int resource,ArrayList<PublicHoliday> objects){
        super(context,resource,objects);
        publicHolidays = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View ConverView, ViewGroup parents){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row,parents,false);
        tvholiday = (TextView)rowView.findViewById(R.id.name);
        tvDate = (TextView)rowView.findViewById(R.id.date);
        imageView = (ImageView)rowView.findViewById(R.id.imageView);
        PublicHoliday currentholiday = publicHolidays.get(position);
        tvholiday.setText(currentholiday.getHoliday());
        tvDate.setText(currentholiday.getDate());

        if(currentholiday.getHoliday().equalsIgnoreCase("newyear")){
            imageView.setImageResource(R.drawable.newyear);
        }else{
            imageView.setImageResource(R.drawable.labourday);
        }
return  rowView;
    }

}
