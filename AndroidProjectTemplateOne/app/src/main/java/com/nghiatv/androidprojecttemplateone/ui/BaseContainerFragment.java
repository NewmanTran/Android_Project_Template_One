package com.nghiatv.androidprojecttemplateone.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nghiatv.androidprojecttemplateone.R;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */
public class BaseContainerFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_base_container, container, false);
    }

    public void replaceFragment(Fragment fragment, boolean isAddToBackStack) {
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        if (isAddToBackStack) {
            transaction.addToBackStack(null);
        }
        transaction.replace(R.id.frame_layout_container, fragment);
        transaction.commitAllowingStateLoss();
        getChildFragmentManager().executePendingTransactions();
    }

    public boolean popFragment() {
        boolean isPop = false;
        if (getChildFragmentManager().getBackStackEntryCount() > 0) {
            isPop = true;
            getChildFragmentManager().popBackStack();
        }
        return isPop;
    }

    public Fragment getCurrentChildFragment() {
        return getChildFragmentManager().findFragmentById(R.id.frame_layout_container);
    }
}
