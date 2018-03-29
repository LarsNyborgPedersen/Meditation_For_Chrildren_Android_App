package com.larsnyborgpedersen.meditationforboern2;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by Lars on 24-03-2018.
 */

public class MainActivity extends BaseActivity{

    public void ad () {

        if (BuildConfig.withAds){
            //if (BuildConfig.FLAVOR.equals("free")){
            MobileAds.initialize(this, getString(R.string.app_id));
            mAdView = (AdView) findViewById(R.id.mAdView);
            // .addTestDevice("7A0D79165612DC5BE550C1D65C05EEBC")
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);
        }
    }

    public void ad2() {

        if (BuildConfig.withAds){
            //if (BuildConfig.FLAVOR.equals("free")){
            if(mInterstitialAd!=null){
                mInterstitialAd=null;
            }

            mInterstitialAd = new InterstitialAd(this);
            mInterstitialAd.setAdUnitId(getResources().getString(R.string.chooseMeditationScreenInterstitial));
            // .addTestDevice("7A0D79165612DC5BE550C1D65C05EEBC")
            AdRequest adRequest = new AdRequest.Builder().build();
            mInterstitialAd.loadAd(adRequest);

            mInterstitialAd.setAdListener(new AdListener(){

                public void onAdClosed(){
                    AdRequest adRequest = new AdRequest.Builder().build();
                    mInterstitialAd.loadAd(adRequest);
                }

            });

        }
    }



}
