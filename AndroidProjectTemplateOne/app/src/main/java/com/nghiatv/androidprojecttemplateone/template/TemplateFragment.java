package com.nghiatv.androidprojecttemplateone.template;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nghiatv.androidprojecttemplateone.ui.BaseFragment;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */
public class TemplateFragment extends BaseFragment {
    public static final String TAG = TemplateFragment.class.getSimpleName();

    public static TemplateFragment newInstance() {
        TemplateFragment fragment = new TemplateFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(0, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
