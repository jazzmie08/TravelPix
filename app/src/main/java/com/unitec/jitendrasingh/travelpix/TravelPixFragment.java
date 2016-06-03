package com.unitec.jitendrasingh.travelpix;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * Created by jitus_000 on 3/06/2016.
 */
public class TravelPixFragment extends Fragment{
    private Button testButton;
    private RatingBar mRatingBar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.activity_main,container,false);
        testButton = (Button)view.findViewById(R.id.travelpix_send);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Test Button",Toast.LENGTH_SHORT).show();
            }
        });

        mRatingBar = (RatingBar)view.findViewById(R.id.rating_bar);
        mRatingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getActivity(),String.valueOf(rating),Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
