package com.example.pickerfordate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }
    public void processDatePickerResult(int year, int month, int day){
        String moth_string = Integer.toString(month +1);
        String dat_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (moth_string+"/"+dat_string+"/"+year_string);
        Toast.makeText(this, "Date: "+ dateMessage,Toast.LENGTH_SHORT).show();

    }
    public void processTimePickerResult(int hourOfDay, int minute){
        String hour_time = Integer.toString(hourOfDay);
        String min_time = Integer.toString(minute);
        String timeMessage = (hour_time + " : " + min_time);
        Toast.makeText(this, "Time: " + timeMessage, Toast.LENGTH_SHORT).show();
    }


    public void showTime(View view) {
        DialogFragment newFragment = new BlankFragment();
        newFragment.show(getSupportFragmentManager(),"TimePicker");
    }
}
