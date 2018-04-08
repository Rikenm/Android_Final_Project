package com.rikenmaharjan.y2yc.activities;

import android.app.Fragment;

import com.rikenmaharjan.y2yc.fragments.EventsFragment;

/**
 * Created by Riken on 4/7/18.
 */

public class EventsActivity extends BaseFragmentActivity {
    @Override
    Fragment createFragment() {
        return EventsFragment.newInstance();
    }
}
