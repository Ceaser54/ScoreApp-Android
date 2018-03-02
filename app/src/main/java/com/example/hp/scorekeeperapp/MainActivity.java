package com.example.hp.scorekeeperapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //ScoresOfTheTeams:
    private int ScoreOfTeamA = 0;
    private int ScoreOfTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //For TeamA:
    public void AddOneForTeamA(View view) {
        ScoreOfTeamA+=1;
        ShowResultOfTeamA(ScoreOfTeamA);
    }

    public void AddTwoForTeamA(View view) {
        ScoreOfTeamA+=2;
        ShowResultOfTeamA(ScoreOfTeamA);
    }

    public void AddThreeForTeamA(View view) {
        ScoreOfTeamA+=3;
        ShowResultOfTeamA(ScoreOfTeamA);
    }

    public void AddFourForTeamA(View view) {
        ScoreOfTeamA+=4;
        ShowResultOfTeamA(ScoreOfTeamA);
    }



    //For TeamB:
    public void AddOneForTeamB(View view) {
        ScoreOfTeamB+=1;
        ShowResultOfTeamB(ScoreOfTeamB);
    }

    public void AddTwoForTeamB(View view) {
        ScoreOfTeamB+=2;
        ShowResultOfTeamB(ScoreOfTeamB);
    }

    public void AddThreeForTeamB(View view) {
        ScoreOfTeamB+=3;
        ShowResultOfTeamB(ScoreOfTeamB);
    }

    public void AddFourForTeamB(View view) {
        ScoreOfTeamB+=4;
        ShowResultOfTeamB(ScoreOfTeamB);
    }


    //For Reset:
    public void ResetTheScore(View view) {
        ScoreOfTeamA=0;
        ScoreOfTeamB=0;
        ShowResultOfTeamA(ScoreOfTeamA);
        ShowResultOfTeamB(ScoreOfTeamB);
    }



    //Displaying The Results:
    public void ShowResultOfTeamA(int score) {
        TextView TheScore = (TextView) findViewById(R.id.TeamA);
        TheScore.setText(String.valueOf(score));
    }

    public void ShowResultOfTeamB(int score) {
        TextView TheScore = (TextView) findViewById(R.id.TeamB);
        TheScore.setText(String.valueOf(score));
    }
}