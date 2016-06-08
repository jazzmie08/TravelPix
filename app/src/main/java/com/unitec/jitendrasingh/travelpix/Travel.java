package com.unitec.jitendrasingh.travelpix;

import java.util.Date;
import java.util.UUID;

/**
 * Created by jitus_000 on 8/06/2016.
 */
public class Travel {
    private String mDescription;
    private UUID mId;
    private float mRating;
    private boolean mSolved;
    private Date mDate;

    public Travel(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public void setDate(Date date){
        mDate = date;
    }

    public Date getDate(){
        return mDate;
    }

    public boolean isSolved(){
        return mSolved;
    }

    public void setSolved(boolean solved){
        mSolved = solved;
    }

    public float getRating(){
        return mRating;
    }

    public void setRating(float rating){
        mRating = rating;
    }
}
