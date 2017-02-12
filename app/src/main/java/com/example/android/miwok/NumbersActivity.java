package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        setTitle("Numbers");

        /*
        String[] words = new String[10];
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";

        Log.v("TAG", "First number in array is: " +  words[0]);
        Log.v("TAG", "Second number in array is: " +  words[1]);
        */

        ArrayList<String> numbers = new ArrayList<>();

        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");
        numbers.add("Five");
        numbers.add("Six");
        numbers.add("Seven");
        numbers.add("Eight");
        numbers.add("Nine");
        numbers.add("Ten");


        LinearLayout rootView = (LinearLayout)  findViewById(R.id.rootView);
        int index = 0;

        while (index < 10) {
            index++;
        }

        TextView one = new TextView(this);
        one.setText(index);
        one.setTextSize(24);
        rootView.addView(one);

        TextView two = new TextView(this);
        two.setText(index);
        two.setTextSize(24);
        rootView.addView(two);

        TextView three = new TextView(this);
        three.setText(index);
        three.setTextSize(24);
        rootView.addView(three);

        TextView four = new TextView(this);
        four.setText(index);
        four.setTextSize(24);
        rootView.addView(four);

        TextView five = new TextView(this);
        five.setText(index);
        five.setTextSize(24);
        rootView.addView(five);

        TextView six = new TextView(this);
        six.setText(index);
        six.setTextSize(24);
        rootView.addView(six);

        TextView seven = new TextView(this);
        seven.setText(index);
        seven.setTextSize(24);
        rootView.addView(seven);

        TextView eight = new TextView(this);
        eight.setText(index);
        eight.setTextSize(24);
        rootView.addView(eight);

        TextView nine = new TextView(this);
        nine.setText(index);
        nine.setTextSize(24);
        rootView.addView(nine);

        TextView ten = new TextView(this);
        ten.setText(index);
        ten.setTextSize(24);
        rootView.addView(ten);


    }

}
