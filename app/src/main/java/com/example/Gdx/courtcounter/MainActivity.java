package com.example.Gdx.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int puntajeA=0;
    int puntajeB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mastresA(View v){
        puntajeA = puntajeA + 3;
        displayForTeamA(puntajeA);
    }
    public void masdosA(View v){
        puntajeA = puntajeA + 2;
        displayForTeamA(puntajeA);
    }
    public void masunoA(View v){
        puntajeA = puntajeA + 1;
        displayForTeamA(puntajeA);
    }
    public void mastresB(View v){
        puntajeB = puntajeB + 3;
        displayForTeamB(puntajeB);
    }
    public void masdosB(View v){
        puntajeB = puntajeB + 2;
        displayForTeamB(puntajeB);
    }
    public void masunoB(View v){
        puntajeB = puntajeB + 1;
        displayForTeamB(puntajeB);
    }
    public void resetScore(View v){
        puntajeA = 0;
        puntajeB = 0;
        displayForTeamA(puntajeA);
        displayForTeamB(puntajeB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

}
