package com.example.a300254326.nikhil_300254326_bingo;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity_300254326 extends AppCompatActivity {

    RelativeLayout calendarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_300254326);
        calendarLayout = (RelativeLayout) findViewById(R.id.calendarLayout);
        Button btn = (Button) findViewById(R.id.btn_date);
        final DatePicker selectedDate = (DatePicker) findViewById(R.id.calendarView);
        String date = selectedDate.getYear()+"-"+(selectedDate.getMonth()+1)+"-"+selectedDate.getDayOfMonth();
        final TextView dt = (TextView) findViewById(R.id.textView_date);
        dt.setText(date.toString());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendarLayout.setVisibility(View.VISIBLE);
                String date2 = selectedDate.getYear()+"-"+(selectedDate.getMonth()+1)+"-"+selectedDate.getDayOfMonth();
                dt.setText(date2.toString());
            }
        });
        Button gobtn = (Button) findViewById(R.id.btnNxt);
        gobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText name = (EditText) findViewById(R.id.editText_name);
                Intent intent = new Intent(MainActivity_300254326.this, bingo_Nikhil.class);
                Bundle bundle = new Bundle();
                String date2 = selectedDate.getYear()+"-"+(selectedDate.getMonth()+1)+"-"+selectedDate.getDayOfMonth();
                bundle.putString("name", name.getText().toString());
                bundle.putString("date", date2.toString());
                intent.putExtras(bundle);
                startActivity(intent);
                finish();

            }
        });

    }



}
