package com.larsnyborgpedersen.meditationforboern2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public abstract class BaseActivity extends AppCompatActivity {


    //Variables
    private Button chooseMeditationScreenButton, chooseHowToMeditateScreenButton, chooseContactScreenButton;
    AdView mAdView;
    public static InterstitialAd mInterstitialAd;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons();
        ad();
        ad2();


    }

    public void buttons() { //Initializing buttons
        chooseMeditationScreenButton = (Button) findViewById(R.id.chooseMeditationScreenButton);
        chooseHowToMeditateScreenButton = (Button) findViewById(R.id.chooseHowToMeditateScreenButton);
        chooseContactScreenButton = (Button) findViewById(R.id.chooseContactScreenButton);


        //Using Button with onClickListener to go to chooseMeditationScreen
        chooseMeditationScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent chooseMeditationScreenIntent = new Intent(BaseActivity.this, ChooseMeditationScreen.class);
                startActivity(chooseMeditationScreenIntent);

            }
        });

        chooseHowToMeditateScreenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent chooseHowToMeditateScreenIntent = new Intent(BaseActivity.this, HowToMeditateScreen.class);
                startActivity(chooseHowToMeditateScreenIntent);
            }
        });

        chooseContactScreenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent chooseContactScreenIntent = new Intent(BaseActivity.this, ContactScreen.class);
                startActivity(chooseContactScreenIntent);
            }
        });
    }

    public void ad () {


    }

    public void ad2() {


    }



    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }




}
