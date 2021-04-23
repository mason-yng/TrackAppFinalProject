package com.example.masonyng.trackapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class moodcalculate extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodcalculate);
    }
    //counts chosen moods
    int sadCount = 0;
    int happyCount = 0;
    int angryCount = 0;
    int total = 0;

    //enters total moods that are to be chosen
    public void enter(View view) {
        Button ent = (Button) findViewById(R.id.enter);
        EditText e = (EditText) findViewById(R.id.moodInput);
        TextView count = (TextView) findViewById(R.id.moodCount);
        int num = Integer.parseInt(e.getText().toString());
        count.setText(new Integer(num).toString());
        total = num;
        ent.setVisibility(View.INVISIBLE); //set enter key and the editText invisible after amount is chosen
        e.setVisibility(View.INVISIBLE);
    }

    //sad imageView
    public void sad(View view) {
        TextView count = (TextView) findViewById(R.id.moodCount);
        if (total > 0) {
            sadCount++;
            --total;
            count.setText(new Integer(total).toString());
        } else {
            result();
        }
    }

    //happy imageView
    public void happy(View view) {
        TextView count = (TextView) findViewById(R.id.moodCount);
        if (total > 0) {
            happyCount++;
            --total;
            count.setText(new Integer(total).toString());
        } else {
            result();
        }
    }

    //angry ImageView
    public void angry(View view) {
        TextView count = (TextView) findViewById(R.id.moodCount);
        if (total > 0) {
            angryCount++;
            --total;
            count.setText(new Integer(total).toString());
        } else {
            result();
        }
    }

    //displays how many of each were selected
    public void result() {
        TextView t = (TextView) findViewById(R.id.moodResults);
        t.setText("Results are in! You were sad " + sadCount + " times, happy " + happyCount + " times and angry " + angryCount + " times");
    }

    //goes back to mood activity screen
    public void back (View view){
        Intent i = new Intent(this,
                mood.class);
        startActivity(i);
    }
}