package com.example.masonyng.trackapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toIns(View view){
        Intent i = new Intent(this,
                instructions.class);
        startActivity(i);
    }

    public void toMood(View view){
        Intent i = new Intent(this,
                mood.class);
        startActivity(i);
    }
    public void toFinance(View view){
        Intent i = new Intent(this,
                finance.class);
        startActivity(i);
    }
    public void toFitness(View view){
        Intent i = new Intent(this,
                fitness.class);
        startActivity(i);
    }
    public void toCalorie(View view){
        Intent i = new Intent(this,
                calorie.class);
        startActivity(i);
    }


    //moves to splash screen
    public void toSplash(){
        Intent i = new Intent(this,
                splash.class);
        startActivity(i);
    }
}
