package com.example.travel_service;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        TextView title=findViewById(R.id.title);
        TextView details=findViewById(R.id.details);

        String titleText=getIntent().getStringExtra("title");
        String detailsText=getIntent().getStringExtra("details");
        title.setText(titleText);
        details.setText(detailsText);
    }
}