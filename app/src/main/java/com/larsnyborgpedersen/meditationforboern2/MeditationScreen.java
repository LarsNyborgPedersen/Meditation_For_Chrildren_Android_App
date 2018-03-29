package com.larsnyborgpedersen.meditationforboern2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MeditationScreen extends AppCompatActivity {

    TextView headline, description;
    ImageView playButton, pauseButton, stopButton;
    MeditationMediaPlayer meditationMediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_meditation_screen);

        //call these functions when starting the app
        getUIButtonsAndTextViews();
        setText();
        callBackMethods();

    }

    public void setText(){
        switch (ChooseMeditationScreenBase.whichMeditation){

            case "visualization":
                headline.setText(getResources().getString(R.string.visualizationHeadline));
                description.setText(getResources().getString(R.string.visualizationDescription));
                break;
            case "bodyScan7Min":
                headline.setText(getResources().getString(R.string.bodyScan7MinHeadline));
                description.setText(getResources().getString(R.string.bodyScan7MinDescription));
                break;
            case "bodyScan13Min":
                headline.setText(getResources().getString(R.string.bodyScan13MinHeadline));
                description.setText(getText(R.string.bodyScan13MinDescription));
                break;
            case "lovingKindness":
                headline.setText(getResources().getString(R.string.lovindKindnessHeadline));
                description.setText(getText(R.string.lovindKindnessDescription));
                break;
            case "rhythmicBreathing5Min":
                headline.setText(getResources().getString(R.string.rhythmicBreathing5MinHeadline));
                headline.setTextSize(30);
                description.setText(getResources().getString(R.string.rhythmicBreathing5MinDescription));
                break;
            case "rhythmicBreathing10Min":
                headline.setText(getResources().getString(R.string.rhythmicBreathing10MinHeadline));
                headline.setTextSize(30);
                description.setText(getResources().getString(R.string.rhythmicBreathing10MinDescription));
                break;
            case "rhythmicBreathing15Min":
                headline.setText(getResources().getString(R.string.rhythmicBreathing15MinHeadline));
                headline.setTextSize(30);
                description.setText(getResources().getString(R.string.rhythmicBreathing15MinDescription));
                break;
            case "rhythmicBreathing20Min":
                headline.setText(getResources().getString(R.string.rhythmicBreathing20MinHeadline));
                headline.setTextSize(30);
                description.setText(getResources().getString(R.string.rhythmicBreathing20MinDescription));
                break;

        }
    }

    // Method for initialize the values
    public void init(){
        switch (ChooseMeditationScreenBase.whichMeditation){
            case "visualization":
                meditationMediaPlayer = new MeditationMediaPlayer (MediaPlayer.create(MeditationScreen.this, R.raw.visualization_7_min));
                break;
            case "bodyScan7Min":
                meditationMediaPlayer = new MeditationMediaPlayer (MediaPlayer.create(MeditationScreen.this, R.raw.body_scan_7_min));
                break;
            case "bodyScan13Min":
                meditationMediaPlayer = new MeditationMediaPlayer (MediaPlayer.create(MeditationScreen.this, R.raw.body_scan_13_min));
                break;
            case "lovingKindness":
                meditationMediaPlayer = new MeditationMediaPlayer (MediaPlayer.create(MeditationScreen.this, R.raw.loving_kindness_7_min));
                break;
            case "rhythmicBreathing5Min":
                meditationMediaPlayer = new MeditationMediaPlayer (MediaPlayer.create(MeditationScreen.this, R.raw.rhythmic_breathing_5_min));
                break;
            case "rhythmicBreathing10Min":
                meditationMediaPlayer = new MeditationMediaPlayer (MediaPlayer.create(MeditationScreen.this, R.raw.rhythmic_breathing_10_min));
                break;
            case "rhythmicBreathing15Min":
                meditationMediaPlayer = new MeditationMediaPlayer (MediaPlayer.create(MeditationScreen.this, R.raw.rhythmic_breathing_15_min));
                break;
            case "rhythmicBreathing20Min":
                meditationMediaPlayer = new MeditationMediaPlayer (MediaPlayer.create(MeditationScreen.this, R.raw.rhythmic_breathing_20_min));
                break;

        }
    }


    // Method for get the object references of UI
    void getUIButtonsAndTextViews(){
        playButton = (ImageView) findViewById(R.id.playButton);
        pauseButton = (ImageView) findViewById(R.id.pauseButton);
        stopButton = (ImageView) findViewById(R.id.stopButton);
        headline = (TextView) findViewById(R.id.headline);
        description = (TextView) findViewById(R.id.description);
    }





    // What to to when clicking the buttons
    void callBackMethods(){
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Initializing the musicPlayer object if it was released.
                if(meditationMediaPlayer !=null){
                    if(meditationMediaPlayer.isSongNull()){
                        init();
                    }
                }

                //Initializing the song if it hasn't been initialized.
                if (meditationMediaPlayer ==null){
                    init();
                }


                meditationMediaPlayer.playFunction();
            }
        });

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                //Initializing the song if it hasn't been initialized.
                if (meditationMediaPlayer ==null){
                    init();
                }

                meditationMediaPlayer.pauseFunction();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                //Initializing the song if it hasn't been initialized.
                if (meditationMediaPlayer ==null){
                    init();
                }

                meditationMediaPlayer.stopFunction();
            }
        });

    }




    @Override
    protected void onDestroy(){
        super.onDestroy();
        if(meditationMediaPlayer !=null){
            meditationMediaPlayer.stopFunction();
        }
    }
}