package com.rikenmaharjan.y2yc.activities;

import android.app.Fragment;

import com.rikenmaharjan.y2yc.fragments.LotteryFragment;

/**
 * Created by Riken on 4/7/18.
 */

public class LotteryActivity  extends BaseFragmentActivity{
    @Override
    Fragment createFragment() {
        return LotteryFragment.newInstance();
    }
}
