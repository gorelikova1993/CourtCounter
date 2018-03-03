package com.example.juliagorelikova.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foalTeamA = 0;
    int foalTeamB = 0;

    public void goalTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void goalTeamB(View v){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void foalTeamA(View v) {
        foalTeamA += 1;
        displayForTeamAFoal(foalTeamA);
    }

    public void  foalTeamB(View v){
        foalTeamB += 1;
        displayForTeamBFoal(foalTeamB);
    }

    public void reset(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        foalTeamB = 0;
        foalTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
        displayForTeamAFoal(foalTeamA);
        displayForTeamBFoal(foalTeamB);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamAFoal(int foal) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foal);
        scoreView.setText(String.valueOf(foal));
    }
    public void displayForTeamBFoal(int foal) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foal);
        scoreView.setText(String.valueOf(foal));
    }
}