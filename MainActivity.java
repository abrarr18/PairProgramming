package com.example.pairprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Date currentTime = Calendar.getInstance().getTime();
    String current ="";
    TextView textv;
    ArrayList<String> timeArray = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textv = (TextView) findViewById(R.id.textView);

    }

    public void onClick(View view){
        current = current +  "\n"+ new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
        textv.setText(current);


    }

}