package com.example.hangman2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity{


        // The score code
        TextView textView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            textView =(TextView) findViewById(R.id.textView);

            Intent intent = getIntent();

            textView.setText("You have" + intent.getStringExtra("tries") + " tries left");
        }
    }
