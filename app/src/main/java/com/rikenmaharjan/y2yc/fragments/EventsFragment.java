package com.rikenmaharjan.y2yc.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rikenmaharjan.y2yc.R;

/**
 * Created by Riken on 4/7/18.
 */

public class EventsFragment extends BaseFragment {
    public static EventsFragment newInstance() {

        return EventsFragment.newInstance();

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_events,container,false);


        return rootView;
    }
}
