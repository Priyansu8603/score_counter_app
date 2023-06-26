package com.example.scoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreViewA = 0;
    int scoreViewB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DisplayScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTextView_TeamA);
        scoreView.setText(String.valueOf(score));
    }

    public void DisplayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTextView_TeamB);
        scoreView.setText(String.valueOf(score));
    }

    public void add3ToTeamA(View view) {
        scoreViewA = scoreViewA + 3;
        DisplayScoreA(scoreViewA);
    }

    public void add2ToTeamA(View view) {
        scoreViewA = scoreViewA + 2;
        DisplayScoreA(scoreViewA);
    }

    public void add1ToTeamA(View view) {
        scoreViewA = scoreViewA + 1;
        DisplayScoreA(scoreViewA);
    }

    public void add1ToTeamB(View view) {
        scoreViewB = scoreViewB + 1;
        DisplayScoreB(scoreViewB);
    }

    public void add2ToTeamB(View view) {
        scoreViewB = scoreViewB + 2;
        DisplayScoreB(scoreViewB);
    }

    public void add3ToTeamB(View view) {
        scoreViewB = scoreViewB + 3;
        DisplayScoreB(scoreViewB);
    }

    public void resetButton(View view) {
        int scoreViewA = 0;
        int scoreViewB = 0;
        DisplayScoreA(scoreViewA);
        DisplayScoreB(scoreViewB);
    }
}