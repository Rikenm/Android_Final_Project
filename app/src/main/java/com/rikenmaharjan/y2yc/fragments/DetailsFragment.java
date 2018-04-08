package com.rikenmaharjan.y2yc.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rikenmaharjan.y2yc.R;

/**
 * Created by Riken on 4/7/18.
 */

public class DetailsFragment extends BaseFragment {

    public static DetailsFragment newInstance(){
        return new DetailsFragment();
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_details,container,false);



        return rootView;
    }





}
