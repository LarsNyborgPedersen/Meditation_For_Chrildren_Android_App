package com.larsnyborgpedersen.meditationforboern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseMeditationScreen extends AppCompatActivity {


    Button bodyScan5MinutesButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_meditation_screen);

        //Initialize Button
        bodyScan5MinutesButton = (Button)findViewById(R.id.bodyScan5MinutesScreenButton);

        //Use button to go to BodyScan5Minutes screen
        bodyScan5MinutesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bodyScan5MinutesIntent = new Intent(ChooseMeditationScreen.this, BodyScan5Minutes.class);
                startActivity(bodyScan5MinutesIntent);

            }
        });


    }



}
