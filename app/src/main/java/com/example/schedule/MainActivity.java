package com.example.schedule;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends android.app.Activity {
    private static String[] weeks ={
            "今天星期日,明天星期一",
            "今天星期一,明天星期二",
            "今天星期二,明天星期三",
            "今天星期三,明天星期四",
            "今天星期四,明天星期五",
            "今天星期五,明天星期六",
            "今天星期六,明天星期日",
    };
    private TextView mTextWeek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar cal = Calendar.getInstance();

        mTextWeek = (TextView) findViewById(R.id.txtWeek);
        mTextWeek.setText(weeks[cal.get(Calendar.DAY_OF_WEEK)-1]);
    }
}