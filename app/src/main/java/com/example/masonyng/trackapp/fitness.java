package com.example.masonyng.trackapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ImageView;

public class fitness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);
        Chronometer simpleChronometer = (Chronometer) findViewById(R.id.time);
        simpleChronometer.start();
    }

    //Displays the +- buttons for each workout
    public void startFitness (View view){
        Button start = (Button) findViewById(R.id.startFitness);
        start.setVisibility(View.INVISIBLE);
        EditText pushup = (EditText) findViewById(R.id.pushupGoal);
        EditText situp = (EditText) findViewById(R.id.situpGoal);
        EditText squat = (EditText) findViewById(R.id.squatGoal);
        EditText free = (EditText) findViewById(R.id.freeGoal);
        Button b = (Button) findViewById(R.id.addPushup);
        Button b1 = (Button) findViewById(R.id.minusPushup);

        Button b2 = (Button) findViewById(R.id.addSitup);
        Button b3 = (Button) findViewById(R.id.minusSitup);

        Button b4 = (Button) findViewById(R.id.addSquat);
        Button b5 = (Button) findViewById(R.id.minusSquat);

        Button b6 = (Button) findViewById(R.id.addFree);
        Button b7 = (Button) findViewById(R.id.minusFree);

        //if there is a goal entered, take that amount and set +- buttons to be visible
        if (pushup.getText().length()>=1){
            b.setVisibility(View.VISIBLE);
            b1.setVisibility(View.VISIBLE);
        }
        //if nothing is entered set the value to 0 and display the buttons
        else{
            pushup.setText(new Integer(0).toString()); //value set to 0 so the +- buttons do not break the code.
            b.setVisibility(View.VISIBLE);
            b1.setVisibility(View.VISIBLE);
        }

        if (situp.getText().length()>=1){
            b2.setVisibility(View.VISIBLE);
            b3.setVisibility(View.VISIBLE);
        }
        else{
            situp.setText(new Integer(0).toString());
            b2.setVisibility(View.VISIBLE);
            b3.setVisibility(View.VISIBLE);
        }

        if (squat.getText().length()>=1){
            b4.setVisibility(View.VISIBLE);
            b5.setVisibility(View.VISIBLE);
        }
        else{
            squat.setText(new Integer(0).toString());
            b4.setVisibility(View.VISIBLE);
            b5.setVisibility(View.VISIBLE);
        }

        if (free.getText().length()>=1){
            b6.setVisibility(View.VISIBLE);
            b7.setVisibility(View.VISIBLE);
        }
        else{
            free.setText(new Integer(0).toString());
            b6.setVisibility(View.VISIBLE);
            b7.setVisibility(View.VISIBLE);
        }

    }

    //moves to main tracker screen
    public void toTrack(View view) {
        Intent i = new Intent(this,
                MainActivity.class);
        startActivity(i);
    }

    //adds one to pushup
    public void addPushup(View view){
        EditText input = (EditText) findViewById(R.id.pushupGoal);
        int Goal = Integer.parseInt(input.getText().toString());
        ImageView Pic = (ImageView) findViewById(R.id.pushupPic);
        ImageView check = (ImageView) findViewById(R.id.checkpushup);
        int x = Goal + 1;
        input.setText(new Integer(x).toString());
        //if goal was reached and image was hidden then the plus will reveal it again
        Pic.setVisibility(View.VISIBLE);
        check.setVisibility(View.INVISIBLE);
    }

    //minuses one to pushup
    public void minusPushup(View view){
        EditText input = (EditText) findViewById(R.id.pushupGoal);
        int Goal = Integer.parseInt(input.getText().toString());
        ImageView Pic = (ImageView) findViewById(R.id.pushupPic);
        ImageView check = (ImageView) findViewById(R.id.checkpushup);

        if(Goal>1)
        {
            int y = Goal - 1;
            input.setText(new Integer(y).toString());
            Pic.setVisibility(View.VISIBLE);
            check.setVisibility(View.INVISIBLE);
        }
        //when goal is reached display a checkmark and hide the image
        else{
            input.setText("0");
            Pic.setVisibility(View.INVISIBLE);
            check.setVisibility(View.VISIBLE);
        }
    }

    public void addSitup(View view){
        EditText input = (EditText) findViewById(R.id.situpGoal);
        int Goal = Integer.parseInt(input.getText().toString());
        ImageView Pic = (ImageView) findViewById(R.id.situpPic);
        ImageView check = (ImageView) findViewById(R.id.checksitup);

            int x = Goal + 1;
            input.setText(new Integer(x).toString());
            Pic.setVisibility(View.VISIBLE);
            check.setVisibility(View.INVISIBLE);

    }

    public void minusSitup(View view){
        EditText input = (EditText) findViewById(R.id.situpGoal);
        ImageView Pic = (ImageView) findViewById(R.id.situpPic);
        ImageView check = (ImageView) findViewById(R.id.checksitup);
        int Goal = Integer.parseInt(input.getText().toString());
                if (Goal > 1) {
                    int y = Goal - 1;
                    input.setText(new Integer(y).toString());
                    Pic.setVisibility(View.VISIBLE);
                    check.setVisibility(View.INVISIBLE);
                } else {
                    input.setText("0");
                    Pic.setVisibility(View.INVISIBLE);
                    check.setVisibility(View.VISIBLE);
                }
    }

    public void addSquat(View view){
        EditText input = (EditText) findViewById(R.id.squatGoal);
        int Goal = Integer.parseInt(input.getText().toString());
        ImageView Pic = (ImageView) findViewById(R.id.squatPic);
        ImageView check = (ImageView) findViewById(R.id.checksquat);
        int x = Goal + 1;
        input.setText(new Integer(x).toString());
        Pic.setVisibility(View.VISIBLE);
        check.setVisibility(View.INVISIBLE);
    }

    public void minusSquat(View view){
        EditText input = (EditText) findViewById(R.id.squatGoal);
        int Goal = Integer.parseInt(input.getText().toString());
        ImageView Pic = (ImageView) findViewById(R.id.squatPic);
        ImageView check = (ImageView) findViewById(R.id.checksquat);

        if (Goal > 1)
        {
            int y = Goal - 1;
            input.setText(new Integer(y).toString());
            Pic.setVisibility(View.VISIBLE);
            check.setVisibility(View.INVISIBLE);
        }
        else
            {
                input.setText("0");
                Pic.setVisibility(View.INVISIBLE);
                check.setVisibility(View.VISIBLE);
            }
    }

    public void addFree(View view){
        EditText input = (EditText) findViewById(R.id.freeGoal);
        ImageView check = (ImageView) findViewById(R.id.checkfree);
        int freeGoal = Integer.parseInt(input.getText().toString());
        int x = freeGoal + 1;
        input.setText(new Integer(x).toString());
        check.setVisibility(View.INVISIBLE);
    }

    public void minusFree(View view){
        EditText input = (EditText) findViewById(R.id.freeGoal);
        int Goal = Integer.parseInt(input.getText().toString());
        ImageView check = (ImageView) findViewById(R.id.checkfree);

        if (Goal > 1){
            int y = Goal - 1;
            input.setText(new Integer(y).toString());
            check.setVisibility(View.INVISIBLE);
        }
        else
        {
            input.setText("0");
            check.setVisibility(View.VISIBLE);
        }
    }
}