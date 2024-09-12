package com.nazira.practicechallenge3;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RelativeLayout layoutmain;
    LinearLayout homebutton,tripbutton,bellbutton,mebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutmain = findViewById(R.id.layoutmain);
        homebutton = findViewById(R.id.homebutton);
        tripbutton = findViewById(R.id.tripbutton);
        bellbutton = findViewById(R.id.bellbutton);
        mebutton = findViewById(R.id.mebutton);

        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                layoutmain.setVisibility(View.VISIBLE);
            }
        });

        tripbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                layoutmain.setVisibility(View.GONE);
            }
        });

        bellbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                layoutmain.setVisibility(View.GONE);
            }
        });

        mebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                layoutmain.setVisibility(View.GONE);
            }
        });


    }
}