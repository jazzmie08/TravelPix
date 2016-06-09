package com.unitec.jitendrasingh.travelpix;

import android.content.Context;

import java.util.List;

/**
 * Created by jitu on 10/06/16.
 */
public class TravelStorage {
    private static TravelStorage sTravelStorage;

    public static TravelStorage get(Context context){
        if(sTravelStorage == null){
            sTravelStorage = new TravelStorage(context);
        }
        return sTravelStorage;
    }
    //private constructor
    private TravelStorage(Context context){

    }
}
