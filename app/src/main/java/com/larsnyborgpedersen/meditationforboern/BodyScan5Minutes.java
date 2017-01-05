package com.larsnyborgpedersen.meditationforboern;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BodyScan5Minutes extends AppCompatActivity {



    //Variabler
    ImageView playButton, pauseButton, stopButton;

    private int paused;
    MediaPlayerFunctions MediaPlayerFunction;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_body_scan5_minutes);

        MediaPlayerFunction = new MediaPlayerFunctions(MediaPlayer.create(BodyScan5Minutes.this, R.raw.kropsscanning));



        //Initializing and using playButton to play music
        playButton = (ImageView) findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayerFunction.playFucntion(MediaPlayer.create(BodyScan5Minutes.this, R.raw.kropsscanning), paused);

            }
        });

        //Initializing and using pauseButton to pause music
        pauseButton = (ImageView) findViewById(R.id.pauseButton);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                paused=MediaPlayerFunction.pauseFunction();

            }
        });

        //Initializing and using stopButton to stop music
        stopButton = (ImageView) findViewById(R.id.stopButton);
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayerFunction.stopFunction();

            }
        });




    }
}
