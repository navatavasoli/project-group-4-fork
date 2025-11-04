package com.example.logintest.domain;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TimeSlot extends AppCompatActivity {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_slot);

        year = getIntent().getIntExtra("YEAR", 0);
        month = getIntent().getIntExtra("MONTH", 0);
        day = getIntent().getIntExtra("DAY", 0);
        //hour = getIntent().getIntExtra("HOUR", 0);
        //minute = getIntent().getIntExtra("MINUTE", 0);

        TextView dateTextView = findViewById(R.id.dateTextView);
        dateTextView.setText(day + "-" + month + "-" + year);
    }
}
