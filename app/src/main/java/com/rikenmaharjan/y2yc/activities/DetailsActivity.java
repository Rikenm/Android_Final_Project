package com.rikenmaharjan.y2yc.activities;

import android.app.Fragment;

import com.rikenmaharjan.y2yc.fragments.DetailsFragment;

/**
 * Created by Riken on 4/7/18.
 */

public class DetailsActivity extends BaseFragmentActivity {
    @Override
    Fragment createFragment() {
        return DetailsFragment.newInstance();
    }
}
