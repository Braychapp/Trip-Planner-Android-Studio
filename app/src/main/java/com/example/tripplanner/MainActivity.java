package com.example.tripplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });



    }

    public void openSecondActivity() {
        //this function puts the contents of both edit text widgets into string to be used later
        //it also goes to the second activity screen
        EditText startText = (EditText) findViewById(R.id.startLocation);
        String startLocation = startText.getText().toString();
        //^^this converts the edit text into a string
        Global.startLocation = startLocation;
        //^^this makes the string available to all activities

        EditText endText = (EditText) findViewById(R.id.destination);
        String endLocation = endText.getText().toString();

        Global.endLocation = endLocation;

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}

