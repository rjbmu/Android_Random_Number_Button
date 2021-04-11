package com.example.randomnumberbutton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int rNum;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randNum(View view) {
        rNum = (int)(Math.random()*1000);
        str = (String.valueOf(rNum));
        TextView randomNumber = this.findViewById(R.id.Random_Number);
        randomNumber.setText(String.valueOf(rNum));
    }
}