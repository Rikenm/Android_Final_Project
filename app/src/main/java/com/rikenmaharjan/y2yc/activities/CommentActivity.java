package com.rikenmaharjan.y2yc.activities;

import android.app.Fragment;

import com.rikenmaharjan.y2yc.fragments.CommentFragment;

/**
 * Created by Riken on 4/7/18.
 */

public class CommentActivity extends BaseFragmentActivity {
    @Override
    Fragment createFragment() {
        return CommentFragment.newInstance();
    }
}
