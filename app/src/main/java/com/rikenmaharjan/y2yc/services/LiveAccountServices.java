package com.rikenmaharjan.y2yc.services;

/**
 * Created by Riken on 3/18/18.
 */

public class LiveAccountServices {

    private static LiveAccountServices mLiveAccountServices;


    public static LiveAccountServices getInstance(){
        if (mLiveAccountServices == null){
            mLiveAccountServices = new LiveAccountServices();
        }
        return mLiveAccountServices;
    }

}
