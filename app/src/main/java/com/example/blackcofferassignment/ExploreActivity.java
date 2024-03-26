package com.example.blackcofferassignment;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

public class ExploreActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ListView profileListView;
    private ProfileAdapter profileAdapter;
    private ArrayList<Profile> profileList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        profileListView = findViewById(R.id.profileListView);

        // Initialize profile list
        profileList = new ArrayList<>();
        // Add sample profiles (you can replace with actual data)
        profileList.add(new Profile("John Doe", "Description of John Doe", R.drawable.profile1));
        profileList.add(new Profile("Jane Smith", "Description of Jane Smith", R.drawable.profile2));
        profileList.add(new Profile("Alice Johnson", "Description of Alice Johnson", R.drawable.profile3));
        profileList.add(new Profile("Bob Brown", "Description of Bob Brown", R.drawable.profile4));

        // Initialize and set adapter
        profileAdapter = new ProfileAdapter(this, profileList);
        profileListView.setAdapter(profileAdapter);
    }
}
