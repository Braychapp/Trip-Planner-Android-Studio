package com.example.tripplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    // Button variables - still new to code so that the input its saved
    private RadioGroup transportRadioGroup;
    private RadioButton busRadioButton;
    private RadioButton taxiRadioButton;
    private RadioButton planeRadioButton;

    private TextView endLocation_id;
    private TextView startLocation_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // Set the TextView with the global variable "endLocation"
        endLocation_id = (TextView) findViewById(R.id.endLocation_id);
        endLocation_id.setText(Global.endLocation);
        // Set the TextView with the global variable "startLocation"
        startLocation_id = (TextView) findViewById(R.id.startLocation_id);
        startLocation_id.setText(Global.startLocation);


    }
}