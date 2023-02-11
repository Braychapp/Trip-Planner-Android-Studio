package com.example.tripplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {



    private TextView endLocation_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);


        endLocation_id.setText(Global.methodTransport_To);
    }
}