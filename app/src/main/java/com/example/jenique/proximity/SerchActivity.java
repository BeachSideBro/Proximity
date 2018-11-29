package com.example.jenique.proximity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class SerchActivity extends HomepageToolbarIneteractions implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serch);

        findViewById(R.id.info_button).setOnClickListener(this);
    }

    public void activate_compatible_view(View view)
    {
        TextView textView = findViewById(R.id.info_text_box);
        Button button = findViewById(R.id.info_button);

        textView.setText("Look for people in your faction with traits and and interests like yours!");
        button.setVisibility(View.VISIBLE);
        button.setText("Search");

    }

    public void activate_Random_view(View view)
    {
        TextView textView = findViewById(R.id.info_text_box);
        Button button = findViewById(R.id.info_button);

        textView.setText("Take a risk and connect with random people in your faction!");
        button.setVisibility(View.VISIBLE);
        button.setText("Search");
    }

    public void activate_specific_view(View view)
    {
        TextView textView = findViewById(R.id.info_text_box);
        Button button = findViewById(R.id.info_button);

        textView.setText("If your looking for something more specific, this is the place to be! Find people in your faction with the traits and interests to your liking.");
        button.setVisibility(View.VISIBLE);
        button.setText("Specify");
    }

    @Override
    public void onClick(View view) {

    }
}