package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //     Variable Declarations go here.
    int scoreHome = 0;
    int scoreAway = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //     Home Team UI Updaters
    public void displayScoreHome(int score) {
        TextView scoreView = findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));
    }

    public void showSecondaryScoreHome(View view) {
        Button twoHome = findViewById(R.id.twoHome);
        twoHome.setVisibility(View.VISIBLE);
        Button oneHome = findViewById(R.id.oneHome);
        oneHome.setVisibility(View.VISIBLE);
        Button fgHome = findViewById(R.id.fgHome);
        fgHome.setVisibility(View.GONE);
        Button safetyHome = findViewById(R.id.safetyHome);
        safetyHome.setVisibility(View.GONE);
        Button cancelHome = findViewById(R.id.cancelHome);
        cancelHome.setVisibility(View.VISIBLE); //remove the other buttons on TD;
    }

    public void hideSecondaryScoreHome(View view) {
        Button twoHome = findViewById(R.id.twoHome);
        twoHome.setVisibility(View.GONE);
        Button oneHome = findViewById(R.id.oneHome);
        oneHome.setVisibility(View.GONE);
        Button cancelHome = findViewById(R.id.cancelHome);
        cancelHome.setVisibility(View.GONE);
        Button fgHome = findViewById(R.id.fgHome);
        fgHome.setVisibility(View.VISIBLE);
        Button safetyHome = findViewById(R.id.safetyHome);
        safetyHome.setVisibility(View.VISIBLE); //show the other buttons on click;
    }

    //     Home Team Scoring Values
    public void tdHome(View view) {
        scoreHome = scoreHome + 6;
        displayScoreHome(scoreHome);
        showSecondaryScoreHome(view);
    }

    public void plus2Home(View view) {
        scoreHome = scoreHome + 2;
        displayScoreHome(scoreHome);
        hideSecondaryScoreHome(view);
    }

    public void plus1Home(View view) {
        scoreHome = scoreHome + 1;
        displayScoreHome(scoreHome);
        hideSecondaryScoreHome(view);
    }

    public void cancelHome(View view) {
        hideSecondaryScoreHome(view);
    }

    public void fgHome(View view) {
        scoreHome = scoreHome + 3;
        displayScoreHome(scoreHome);
    }

    public void safetyHome(View view) {
        scoreHome = scoreHome - 2;
        displayScoreHome(scoreHome);
    }

    //     Away Team UI Updaters
    public void displayScoreAway(int score) {
        TextView scoreView = findViewById(R.id.away_team_score);
        scoreView.setText(String.valueOf(score));
    }

    public void showSecondaryScoreAway(View view) {
        Button twoAway = findViewById(R.id.twoAway);
        twoAway.setVisibility(View.VISIBLE);
        Button oneAway = findViewById(R.id.oneAway);
        oneAway.setVisibility(View.VISIBLE);
        Button fgAway = findViewById(R.id.fgAway);
        fgAway.setVisibility(View.GONE);
        Button safetyAway = findViewById(R.id.safetyAway);
        safetyAway.setVisibility(View.GONE);
        Button cancelAway = findViewById(R.id.cancelAway);
        cancelAway.setVisibility(View.VISIBLE); //remove the other buttons on TD;
    }

    public void hideSecondaryScoreAway(View view) {
        Button twoAway = findViewById(R.id.twoAway);
        twoAway.setVisibility(View.GONE);
        Button oneAway = findViewById(R.id.oneAway);
        oneAway.setVisibility(View.GONE);
        Button cancelAway = findViewById(R.id.cancelAway);
        cancelAway.setVisibility(View.GONE);
        Button fgAway = findViewById(R.id.fgAway);
        fgAway.setVisibility(View.VISIBLE);
        Button safetyAway = findViewById(R.id.safetyAway);
        safetyAway.setVisibility(View.VISIBLE); //show the other buttons on click;
    }

    //     Away Team Scoring Values
    public void tdAway(View view) {
        scoreAway = scoreAway + 6;
        displayScoreAway(scoreAway);
        showSecondaryScoreAway(view);
    }

    public void plus2Away(View view) {
        scoreAway = scoreAway + 2;
        displayScoreAway(scoreAway);
        hideSecondaryScoreAway(view);
    }

    public void plus1Away(View view) {
        scoreAway = scoreAway + 1;
        displayScoreAway(scoreAway);
        hideSecondaryScoreAway(view);
    }

    public void cancelAway(View view) {
        hideSecondaryScoreAway(view);
    }

    public void fgAway(View view) {
        scoreAway = scoreAway + 3;
        displayScoreAway(scoreAway);
    }

    public void safetyAway(View view) {
        scoreAway = scoreAway - 2;
        displayScoreAway(scoreAway);
    }

    public void scoreReset(View view) {
        scoreHome = 0;
        scoreAway = 0;
        displayScoreHome(scoreHome);
        displayScoreAway(scoreAway);
    }
}
