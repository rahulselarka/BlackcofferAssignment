package com.example.blackcofferassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView selectAvailabilityTextView;
    private TextView addStatusTextView;
    private TextView selectDistanceTextView;
    private TextView selectPurposeTextView;
    private SeekBar distanceSeekBar;
    private Button saveExploreButton;
    private TextView exploreTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        selectAvailabilityTextView = findViewById(R.id.selectAvailabilityTextView);
        addStatusTextView = findViewById(R.id.addStatusTextView);
        selectDistanceTextView = findViewById(R.id.selectDistanceTextView);
        selectPurposeTextView = findViewById(R.id.selectPurposeTextView);
        distanceSeekBar = findViewById(R.id.distanceSeekBar);
        saveExploreButton = findViewById(R.id.saveButton);
        exploreTextView = findViewById(R.id.exploreTextView);

        exploreTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the ExploreActivity
                Intent intent = new Intent(MainActivity.this, ExploreActivity.class);
                startActivity(intent);
            }
        });


        // Implement your logic here
        // For example, you can add listeners to views, handle button clicks, etc.
    }
}
