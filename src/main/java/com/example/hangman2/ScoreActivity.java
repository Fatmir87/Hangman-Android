package com.example.hangman2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScoreActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        TextView textView= (TextView) findViewById(R.id.scorelabel);
        TextView totalScoreLabel = ( TextView) findViewById(R.id.totalScoreLabel);


    }
}
