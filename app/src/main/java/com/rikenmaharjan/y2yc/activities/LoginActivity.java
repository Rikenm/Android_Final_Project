package com.rikenmaharjan.y2yc.activities;

import android.app.Fragment;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.Window;
import android.view.WindowManager;

import com.rikenmaharjan.y2yc.R;
import com.rikenmaharjan.y2yc.fragments.LoginFragment;

public class LoginActivity extends BaseFragmentActivity {

    //BaseFragmentActivity calls the following method and create LoginFragment to add to this activity

    @Override
    Fragment createFragment() {
        return LoginFragment.newInstance();
    }



}