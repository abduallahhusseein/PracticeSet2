package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {
    int TeamScoreA=0;
    int TeamScoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          dispalyForTeamA(TeamScoreA);
          dispalyForTeamB(TeamScoreB);

    }

    /*
    Method To Display The Score Of Team A
    * */
    public void dispalyForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /*
    Method To Display The Score Of Team B
    * */
    public void dispalyForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
     public void addOneForTeama(View v)
     {
         TeamScoreA=TeamScoreA+1;
         dispalyForTeamA(TeamScoreA);
     }
     public void addTwoForTeama(View v)
     {
         TeamScoreA=TeamScoreA+2;
         dispalyForTeamA(TeamScoreA);
     }
     public void addThreeForTeama(View v)
     {
         TeamScoreA=TeamScoreA+3;
         dispalyForTeamA(TeamScoreA);
     }
    public void addOneForTeamb(View v)
    {
        TeamScoreB=TeamScoreB+1;
        dispalyForTeamB(TeamScoreB);
    }
    public void addTwoForTeamb(View v)
    {
        TeamScoreB=TeamScoreB+2;
        dispalyForTeamB(TeamScoreB);
    }
    public void addThreeForTeamb(View v)
    {
        TeamScoreB=TeamScoreB+3;
        dispalyForTeamB(TeamScoreB);
    }
    /*
    Method To reset The Score
    * */
    public void ResetScore(View v)
    {
        TeamScoreA=0;
        TeamScoreB=0;
        dispalyForTeamA(TeamScoreA);
        dispalyForTeamB(TeamScoreB);
    }
}
