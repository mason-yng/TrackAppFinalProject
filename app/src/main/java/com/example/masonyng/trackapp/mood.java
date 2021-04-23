package com.example.masonyng.trackapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class mood extends AppCompatActivity {
    private static final String monMood="";
    private static final String tueMood="";
    private static final String wedMood="";
    private static final String thuMood="";
    private static final String friMood="";
    private static final String satMood="";
    private static final String sunMood="";

    EditText t, t1, t2, t3, t4, t5, t6;
    TextView mon, tue, wed, thu, fri, sat, sun;
    String monday, tuesday, wednesday, thursday, friday, saturday, sunday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);
        t = (EditText) findViewById(R.id.Monday);
        t1 = (EditText) findViewById(R.id.Tuesday);
        t2 = (EditText) findViewById(R.id.Wednesday);
        t3 = (EditText) findViewById(R.id.Thursday);
        t4 = (EditText) findViewById(R.id.Friday);
        t5 = (EditText) findViewById(R.id.Saturday);
        t6 = (EditText) findViewById(R.id.Sunday);

        mon = (TextView) findViewById(R.id.mon);
        tue = (TextView) findViewById(R.id.tue);
        wed = (TextView) findViewById(R.id.wed);
        thu = (TextView) findViewById(R.id.thu);
        fri = (TextView) findViewById(R.id.fri);
        sat = (TextView) findViewById(R.id.sat);
        sun = (TextView) findViewById(R.id.sun);


        //tried to save information entered to be reentered upon switching activities or exiting app
        //only saves information if stayed within that activity

        /*if you enter information and click save
        and then change the inputs and click reveal saved
         it will display what was originally entered when you clicked save*/

        if (savedInstanceState != null){
            String savedMonday = savedInstanceState.getString(monMood);
            mon.setText(savedMonday);

            String savedTuesday = savedInstanceState.getString(tueMood);
            tue.setText(savedTuesday);

            String savedWednesday = savedInstanceState.getString(wedMood);
            wed.setText(savedWednesday);

            String savedThursday = savedInstanceState.getString(thuMood);
            thu.setText(savedThursday);

            String savedFriday = savedInstanceState.getString(friMood);
            fri.setText(savedFriday);

            String savedSaturday = savedInstanceState.getString(satMood);
            sat.setText(savedSaturday);

            String savedSunday = savedInstanceState.getString(sunMood);
            sun.setText(savedSunday);

        }
        else {
            Toast.makeText(this, "New entry", Toast.LENGTH_SHORT).show();
        }
        Chronometer simpleChronometer = (Chronometer) findViewById(R.id.time);
        simpleChronometer.start();
    }

    //tried to save information entered to be reentered upon switching activities or exiting app
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        // Save custom values into the bundle
        savedInstanceState.putString(monMood, mon.getText().toString());
        savedInstanceState.putString(tueMood, tue.getText().toString());
        savedInstanceState.putString(wedMood, wed.getText().toString());
        savedInstanceState.putString(thuMood, thu.getText().toString());
        savedInstanceState.putString(friMood, fri.getText().toString());
        savedInstanceState.putString(satMood, sat.getText().toString());
        savedInstanceState.putString(sunMood, sun.getText().toString());

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    //Only saves within current activity
    public void saveMoods(View view){
        mon.setText(t.getText().toString());
        tue.setText(t1.getText().toString());
        wed.setText(t2.getText().toString());
        thu.setText(t3.getText().toString());
        fri.setText(t4.getText().toString());
        sat.setText(t5.getText().toString());
        sun.setText(t6.getText().toString());
    }

    //Can reveal what is saved in current activity not when it is restarted
    public void revealSaved(View view){
        t.setText(mon.getText().toString());
        t1.setText(tue.getText().toString());
        t2.setText(wed.getText().toString());
        t3.setText(thu.getText().toString());
        t4.setText(fri.getText().toString());
        t5.setText(sat.getText().toString());
        t6.setText(sun.getText().toString());
    }

    /*Can't save activity when exited
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        //restore state members from saved instance
        monday = savedInstanceState.getString(monMood);
        tuesday = savedInstanceState.getString(tueMood);
        wednesday = savedInstanceState.getString(wedMood);
        thursday = savedInstanceState.getString(thuMood);
        friday = savedInstanceState.getString(friMood);
        saturday = savedInstanceState.getString(satMood);
        sunday = savedInstanceState.getString(sunMood);
    }*/


    public void calcMood (View view){
        Intent i = new Intent(this,
                moodcalculate.class);
        startActivity(i);
    }

    public void toTrack(View view) {
        Intent i = new Intent(this,
                MainActivity.class);
        startActivity(i);
    }
}