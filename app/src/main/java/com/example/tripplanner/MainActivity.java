package com.example.tripplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private TextView startText;
    private String startLocation;
    private ArrayList<Trip> tripsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        startText = findViewById(R.id.start_location);
        startLocation = "New York City";
        startText.setText(startLocation);

        tripsList = new ArrayList<>();
        tripsList.add(new Trip("Los Angeles", "Flight", "$250"));
        tripsList.add(new Trip("Chicago", "Train", "$150"));
        tripsList.add(new Trip("Miami", "Car", "$100"));

        mAdapter = new TripAdapter(tripsList);
        recyclerView.setAdapter(mAdapter);
    }
}
