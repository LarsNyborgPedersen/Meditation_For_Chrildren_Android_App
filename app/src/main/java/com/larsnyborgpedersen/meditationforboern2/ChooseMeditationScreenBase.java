package com.larsnyborgpedersen.meditationforboern2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public abstract class ChooseMeditationScreenBase extends AppCompatActivity {


    Button visualizationButton, bodyScan7MinButton, bodyScan13MinButton, lovingKindnessButton, rhythmicBreathing5MinButton, rhythmicBreathing10MinButton, rhythmicBreathing15MinButton, rhythmicBreathing20MinButton;
    public static String whichMeditation;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_meditation_screen);

        getUIButtons();
        callBackMethods();
        ad();
    }

    public void getUIButtons(){
        //Initialize Buttons

        visualizationButton = (Button)findViewById(R.id.visualizationButton);
        bodyScan7MinButton = (Button)findViewById(R.id.bodyScan7MinButton);
        bodyScan13MinButton = (Button)findViewById(R.id.bodyScan13MinButton);
        lovingKindnessButton = (Button)findViewById(R.id.lovingKindnessButton);
        rhythmicBreathing5MinButton = (Button)findViewById(R.id.rhythmicBreathing5MinButton);
        rhythmicBreathing10MinButton = (Button)findViewById(R.id.rhythmicBreathing10MinButton);
        rhythmicBreathing15MinButton = (Button)findViewById(R.id.rhythmicBreathing15MinButton);
        rhythmicBreathing20MinButton = (Button)findViewById(R.id.rhythmicBreathing20MinButton);
    }

    public void callBackMethods() {

        //Use buttons to choose MeditationScreen meditation

        visualizationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newScreen = new Intent(ChooseMeditationScreenBase.this, MeditationScreen.class);
                whichMeditation = "visualization";
                startActivity(newScreen);

            }
        });

        bodyScan7MinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newScreen = new Intent(ChooseMeditationScreenBase.this, MeditationScreen.class);
                whichMeditation = "bodyScan7Min";
                startActivity(newScreen);

            }
        });


        bodyScan13MinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newScreen = new Intent(ChooseMeditationScreenBase.this, MeditationScreen.class);
                whichMeditation = "bodyScan13Min";
                startActivity(newScreen);

            }
        });

        lovingKindnessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newScreen = new Intent(ChooseMeditationScreenBase.this, MeditationScreen.class);
                whichMeditation = "lovingKindness";
                startActivity(newScreen);

            }
        });

        rhythmicBreathing5MinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newScreen = new Intent(ChooseMeditationScreenBase.this, MeditationScreen.class);
                whichMeditation = "rhythmicBreathing5Min";
                startActivity(newScreen);

            }
        });

        rhythmicBreathing10MinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newScreen = new Intent(ChooseMeditationScreenBase.this, MeditationScreen.class);
                whichMeditation = "rhythmicBreathing10Min";
                startActivity(newScreen);

            }
        });


        rhythmicBreathing15MinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newScreen = new Intent(ChooseMeditationScreenBase.this, MeditationScreen.class);
                whichMeditation = "rhythmicBreathing15Min";
                startActivity(newScreen);

            }
        });


        rhythmicBreathing20MinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newScreen = new Intent(ChooseMeditationScreenBase.this, MeditationScreen.class);
                whichMeditation = "rhythmicBreathing20Min";
                startActivity(newScreen);

            }
        });
    }

    public void ad() {


    }

}



