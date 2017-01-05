package com.larsnyborgpedersen.meditationforboern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    //Variables
    Button chooseMeditationScreenButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing button
        chooseMeditationScreenButton = (Button) findViewById(R.id.chooseMeditationScreenButton);

        //Using Button with onClickListener to go to chooseMeditationScreen
        chooseMeditationScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent chooseMeditationScreenIntent = new Intent(MainActivity.this, ChooseMeditationScreen.class);
                startActivity(chooseMeditationScreenIntent);

            }
        });
    }


}
