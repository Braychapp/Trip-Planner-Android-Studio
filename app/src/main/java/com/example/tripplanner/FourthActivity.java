//=================================================================
// File: FourthActivity
//
//Purpose:  This Activity is the fourth window in our app.
//          It provides the user with a summary of travel
//          destinations and transport chosen.
//
//=================================================================


package com.example.tripplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    private TextView endLocation_id;
    private TextView startLocation_id;
    private TextView methodTransOption;

    private TextView endLocation_id2;
    private TextView startLocation_id2;

    private TextView methodTransOption2;

    private Button closeBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        // ==============================
        // GET REFERENCES TO THE WIDGETS
        // ==============================

        endLocation_id = (TextView) findViewById(R.id.endLocation_id);
        startLocation_id = (TextView) findViewById(R.id.startLocation_id);

        methodTransOption = (TextView) findViewById(R.id.methodTransOption);

        endLocation_id2 = (TextView) findViewById(R.id.endLocation_id2);
        methodTransOption2 = (TextView) findViewById(R.id.methodTransOption2);


        endLocation_id.setText(Global.endLocation);
        startLocation_id.setText(Global.startLocation);
        // Second set of pairs
        endLocation_id2.setText(Global.startLocation);
        startLocation_id2.setText(Global.endLocation);

        closeBtn = (Button) findViewById(R.id.closeBtn);


        // CLOSE APP
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });


    }




}