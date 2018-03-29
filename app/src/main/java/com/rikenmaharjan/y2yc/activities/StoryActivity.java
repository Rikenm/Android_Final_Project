package com.rikenmaharjan.y2yc.activities;

import android.app.Fragment;

import com.rikenmaharjan.y2yc.fragments.LoginFragment;

/**
 * Created by Riken on 3/24/18.
 */

public class StoryActivity extends BaseFragmentActivity {

    @Override
    Fragment createFragment() {
        return LoginFragment.newInstance();
    }
}
