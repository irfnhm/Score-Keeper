package com.example.irfan.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Display the give score for team A
    public void displayScoreTeamA(int i) {
        TextView tv = (TextView) findViewById(R.id.score_team_a);
        tv.setText(i + "");
    }

    //Display the given score for team B
    public void displayScoreTeamB(int j) {
        TextView tv = (TextView) findViewById(R.id.score_team_b);
        tv.setText(j + "");
    }

    //Display messages if any.
    public void displayMessage(String text) {
        TextView tv = (TextView) findViewById(R.id.winner);
        tv.setText(text + "");
    }

    //Increement team A by 3
    public void addThreeTeamA(View view) {
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);

        if(scoreTeamA > 11) {
            displayMessage("Team A Won!");
        }
        else if(scoreTeamB > 11) {
            displayMessage("Team B Won!");
        }
        else if(scoreTeamA == 11 && scoreTeamB < 11) {
            displayMessage("Team A Won!");
        }
        else if(scoreTeamA < 11 && scoreTeamB == 11){
            displayMessage("Team B Won!");
        }
        else if(scoreTeamA > scoreTeamB){
            displayMessage("Team A is leading!");
        }
        else if(scoreTeamA < scoreTeamB){
            displayMessage("Team B is leading!");
        }
        else if(scoreTeamA == 11 && scoreTeamB == 11){
            displayMessage("Match Draw!");
        }
        else if(scoreTeamA == scoreTeamB){
            displayMessage("Equal Scores!");
        }
        else
            displayMessage(" ");
    }

    // Increement team A by 2 points
    public void addTwoTeamA(View view) {
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);

        if(scoreTeamA > 11) {
            displayMessage("Team A Won!");
        }
        else if(scoreTeamB > 11) {
            displayMessage("Team B Won!");
        }
        else if(scoreTeamA == 11 && scoreTeamB < 11) {
            displayMessage("Team A Won!");
        }
        else if(scoreTeamA < 11 && scoreTeamB == 11){
            displayMessage("Team B Won!");
        }
        else if(scoreTeamA > scoreTeamB){
            displayMessage("Team A is leading!");
        }
        else if(scoreTeamA < scoreTeamB){
            displayMessage("Team B is leading!");
        }
        else if(scoreTeamA == 11 && scoreTeamB == 11){
            displayMessage("Match Draw!");
        }
        else if(scoreTeamA == scoreTeamB){
            displayMessage("Equal Scores!");
        }
        else
            displayMessage(" ");
    }

    //Increement team A by 1 point
    public void addOneTeamA(View view) {
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);

        if(scoreTeamA > 11) {
            displayMessage("Team A Won!");
        }
        else if(scoreTeamB > 11) {
            displayMessage("Team B Won!");
        }
        else if(scoreTeamA == 11 && scoreTeamB < 11) {
            displayMessage("Team A Won!");
        }
        else if(scoreTeamA < 11 && scoreTeamB == 11){
            displayMessage("Team B Won!");
        }
        else if(scoreTeamA > scoreTeamB){
            displayMessage("Team A Ahead!");
        }
        else if(scoreTeamA < scoreTeamB){
            displayMessage("Team B Ahead!");
        }
        else if(scoreTeamA == 11 && scoreTeamB == 11){
            displayMessage("Match Draw!");
        }
        else if(scoreTeamA == scoreTeamB){
            displayMessage("Equal Scores!");
        }
        else
            displayMessage(" ");
    }

    //Increement team B by 3 points
    public void addThreeTeamB(View view) {
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);

        if(scoreTeamA > 11) {
            displayMessage("Team A Won!");
        }
        else if(scoreTeamB > 11) {
            displayMessage("Team B Won!");
        }
        else if( scoreTeamA == 11 && scoreTeamB < 11 ) {
            displayMessage("Team A Won!");
        }
        else if( scoreTeamA < 11 && scoreTeamB == 11 ){
            displayMessage("Team B Won!");
        }
        else if(scoreTeamA > scoreTeamB){
            displayMessage("Team A is leading!");
        }
        else if(scoreTeamA < scoreTeamB){
            displayMessage("Team B is leading!");
        }
        else if(scoreTeamA == 11 && scoreTeamB == 11){
            displayMessage("Match Draw!");
        }
        else if(scoreTeamA == scoreTeamB){
            displayMessage("Equal Scores!");
        }
        else
            displayMessage(" ");
    }

    //Increement team B by 2 points
    public void addTwoTeamB(View view) {
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);

        if(scoreTeamA > 11) {
            displayMessage("Team A Won!");
        }
        else if(scoreTeamB > 11) {
            displayMessage("Team B Won!");
        }
        else if( scoreTeamA == 11 && scoreTeamB < 11 ) {
            displayMessage("Team A Won!");
        }
        else if(scoreTeamA < 11 && scoreTeamB == 11){
            displayMessage("Team B Won!");
        }
        else if(scoreTeamA > scoreTeamB){
            displayMessage("Team A is leading!");
        }
        else if(scoreTeamA < scoreTeamB){
            displayMessage("Team B is leading!");
        }
        else if(scoreTeamA == 11 && scoreTeamB == 11){
            displayMessage("Match Draw!");
        }
        else if(scoreTeamA == scoreTeamB){
            displayMessage("Equal Scores!");
        }
        else
            displayMessage(" ");
    }

    //Increement team B by 1 point
    public void addOneTeamB(View view) {
        scoreTeamB += 1;
        displayScoreTeamB(scoreTeamB);

        if(scoreTeamA > 11) {
            displayMessage("Team A Won!");
        }
        else if(scoreTeamB > 11) {
            displayMessage("Team B Won!");
        }
        else if(scoreTeamA == 11 && scoreTeamB < 11){
            displayMessage("Team A Won!");
        }
        else if(scoreTeamA < 11 && scoreTeamB == 11) {
            displayMessage("Team B Won!");
        }
        else if(scoreTeamA > scoreTeamB){
            displayMessage("Team A is leading!");
        }
        else if(scoreTeamA < scoreTeamB){
            displayMessage("Team B is leading!");
        }
        else if(scoreTeamA == 11 && scoreTeamB == 11){
            displayMessage("Match Draw!");
        }
        else if(scoreTeamA == scoreTeamB){
            displayMessage("Equal Scores!");
        }
        else
            displayMessage(" ");
    }

    //Resets the entire scoreboard and game levels.
    public void reset(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayMessage("Let's get started!");
    }
}