package com.example.deleting.bookticketcgv;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Calendar;

import devs.mulham.horizontalcalendar.HorizontalCalendar;

public class DatVeActivity extends AppCompatActivity {
    HorizontalCalendar horizontalCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datve);

        /** end after 1 month from now */
            Calendar endDate = Calendar.getInstance();
            endDate.add(Calendar.MONTH, 1);

            /** start before 1 month from now */
            Calendar startDate = Calendar.getInstance();
            startDate.add(Calendar.MONTH, -1);

            horizontalCalendar = new HorizontalCalendar.Builder(this, R.id.calendarView)
                    .startDate(startDate.getTime())
                    .endDate(endDate.getTime())
                    .datesNumberOnScreen(5)
                    .dayNameFormat("EEE")
                    .dayNumberFormat("dd")
                    .monthFormat("MMM")
                    .showDayName(true)
                    .showMonthName(true)
                    .textColor(Color.LTGRAY, Color.WHITE)
                    .selectedDateBackground(Color.TRANSPARENT)
                    .build();
        }
}
