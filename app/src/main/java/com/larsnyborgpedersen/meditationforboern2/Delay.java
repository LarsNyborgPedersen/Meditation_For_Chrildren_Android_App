package com.larsnyborgpedersen.meditationforboern2;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by Lars on 06-01-2017.
 */

public class Delay extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        SystemClock.sleep(500);
    }
}
