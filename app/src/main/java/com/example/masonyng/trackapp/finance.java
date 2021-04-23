package com.example.masonyng.trackapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class finance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance);
        Chronometer simpleChronometer = (Chronometer) findViewById(R.id.time);
        simpleChronometer.start();
    }

    //subtracts from the weekly budget
    public void weeklyMinus (View view){
        EditText wB = (EditText) findViewById(R.id.weeklyBudget);
        EditText w = (EditText) findViewById(R.id.weeklyInput);

        int wBudget = Integer.parseInt(wB.getText().toString());
        int wInput = Integer.parseInt(w.getText().toString());
        if (wB.getText().length()>0){
            int budge = wBudget-wInput;
            wB.setText(new Integer(budge).toString());
            w.setText("");
            w.setHint("How much have you spent?");
        }
        else {
            wB.setHint ("Weekly Budget?");
            w.setHint ("Enter an amount to deduct");
        }
    }

    //subtracts from the monthly budget
    public void monthlyMinus (View view){
        EditText mB = (EditText) findViewById(R.id.monthlyBudget);
        EditText m = (EditText) findViewById(R.id.monthlyInput);

        int mBudget = Integer.parseInt(mB.getText().toString());
        int mInput = Integer.parseInt(m.getText().toString());
        if (mB.getText().length()>0){
            int budge = mBudget-mInput;
            mB.setText(new Integer(budge).toString());
            m.setText("");
            m.setHint("How much have you spent?");
        }

        else {
            mB.setHint ("Monthly Budget?");
            m.setHint ("Enter an amount to deduct");
        }

    }
    //adds up the 6 categories
    public void calcFinance(View view){
        //grab all 6 inputs from the user
        EditText t = (EditText) findViewById(R.id.groceryInput);
        EditText t2 = (EditText) findViewById(R.id.entertainmentInput);
        EditText t3 = (EditText) findViewById(R.id.transportationInput);

        EditText t4 = (EditText) findViewById(R.id.housingInput);
        EditText t5 = (EditText) findViewById(R.id.insuranceInput);
        EditText t6 = (EditText) findViewById(R.id.miscellaneousInput);
        //grab their integers
        int grocery = Integer.parseInt(t.getText().toString());
        int entertainment = Integer.parseInt(t2.getText().toString());
        int transportation = Integer.parseInt(t3.getText().toString());
        int housing = Integer.parseInt(t4.getText().toString());
        int insurance = Integer.parseInt(t5.getText().toString());
        int miscellaneous = Integer.parseInt(t6.getText().toString());

        //result
        //my attempt at making it calculate without all 6 sections filled out... (did not quite work out)
        int total = 0;
        TextView result = (TextView) findViewById(R.id.financeResult);
        if (t.getText().length()>0){
            total = total + grocery;
        }
        else{
            total=total+0;
        }
        if (t2.getText().length()>0){
            total = total + entertainment;
        }
        else{
            total=total+0;
        }
        if (t3.getText().length()>0){
            total = total + transportation;
        }
        else{
            total=total+0;
        }
        if (t4.getText().length()>0){
            total = total + housing;
        }
        else{
            total=total+0;
        }
        if (t5.getText().length()>0){
            total = total + insurance;
        }
        else{
            total=total+0;
        }
        if (t6.getText().length()>0){
            total = total + miscellaneous;
        }
        else{
            total=total+0;
        }

        result.setText("Total is $"+new Integer(total).toString());

    }

    //moves to main tracker screen
    public void toTrack(View view) {
        Intent i = new Intent(this,
                MainActivity.class);
        startActivity(i);
    }
}
