package com.example.masonyng.trackapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Chronometer;

public class calorie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie);
        Chronometer simpleChronometer = (Chronometer) findViewById(R.id.time);
        simpleChronometer.start();
    }


    /*Information typed in currently does
    not save when moving between activities or exiting the application*/

    //moves to main tracker screen
    public void toTrack(View view) {
        Intent i = new Intent(this,
                MainActivity.class);
        startActivity(i);
    }
}
