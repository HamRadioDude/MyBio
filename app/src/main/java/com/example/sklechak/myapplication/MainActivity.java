package com.example.sklechak.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnNext1 = findViewById(R.id.idButtonNext);
        btnNext1.setOnClickListener(new View.OnClickListener() { // bew View.O will present a list of options. keep listening for the click of the button.
            @Override
            public void onClick(View v) { // then when someone actually clicks the button... do whats in this function here
                Intent in1 = new Intent(MainActivity.this, Main2Activity.class); // defining intent.
                startActivity(in1);  // starting the activity - intent

            }
        });

    }
}
