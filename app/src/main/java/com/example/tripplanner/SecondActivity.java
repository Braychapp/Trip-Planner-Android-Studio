package com.example.tripplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private Button addButton;
    private Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        addButton = findViewById(R.id.addDestinationButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {onAddButtonClicked();}
        });

        continueButton = findViewById(R.id.continueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThirdActivity();
            }
        });

    }

    public void onAddButtonClicked() {
        EditText addDestination = findViewById(R.id.addDestination);
        String destination = addDestination.getText().toString();

        String[] destinations = getResources().getStringArray(R.array.extra_destinations);
        String[] updatedDestinations = Arrays.copyOf(destinations, destinations.length + 1);
        updatedDestinations[destinations.length] = destination;

        String startLocation = getResources().getString(R.string.starting_location);
        String endLocation = getResources().getString(R.string.end_location);

        StringBuilder builder = new StringBuilder();
        builder.append(startLocation);

        //loop through the array of additional locations
        for (int i = 0; i < updatedDestinations.length; i++)
        {
            builder.append(updatedDestinations[i]);
            if (i < updatedDestinations.length - 1)
            {
                builder.append(" -> ");
            }
        }
        builder.append(" -> ").append(endLocation);

    }

    public void openThirdActivity() {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}