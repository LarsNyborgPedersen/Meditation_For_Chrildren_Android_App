package com.larsnyborgpedersen.meditationforboern;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MediaPlayerFunctions extends AppCompatActivity {

    //Variables
    private MediaPlayer musicPlayer;

    //Constructor
     public MediaPlayerFunctions(MediaPlayer x){
         this.musicPlayer=x;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player_functions);
    }

    // General playFunction to use with all the meditations
    public void playFucntion (MediaPlayer x, int y){
        if(musicPlayer==null){
            musicPlayer = x;
            musicPlayer.start();
        } else if (!musicPlayer.isPlaying()) {
            musicPlayer.seekTo(y);
            musicPlayer.start();

        }
    }
    //General pauseFunction to use with all the meditations
    public int pauseFunction (){
        if(musicPlayer!=null) {
            if (musicPlayer.isPlaying()) {
                musicPlayer.pause();
                int x;
                x = musicPlayer.getCurrentPosition();
                return x;
            }
        }
        return 0;
    }

    // General stopfunction to use with all the meditations
    public void stopFunction() {
        if(musicPlayer!=null) {
            musicPlayer.stop();
            musicPlayer = null;
        }
    }

}
