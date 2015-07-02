package com.nghiatv.androidprojecttemplateone.template;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.nghiatv.androidprojecttemplateone.R;
import com.nghiatv.androidprojecttemplateone.ui.BaseActivity;
import com.nghiatv.androidprojecttemplateone.util.ConnectionUtil;


/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */
public class TemplateActivity extends BaseActivity {
    public static final String TAG = TemplateActivity.class.getSimpleName();

    // 1. Data

    // 2. List
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView mRecyclerView;

    public static void startActivity(Activity activity) {
        Intent intent = new Intent(activity, TemplateActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getContentView() {
        return R.layout.activity_template;
    }

    @Override
    public void init() {
        mAdapter = null;
        mLayoutManager = null;

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    }

    @Override
    public void setValue() {
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void setListener() {

    }

    public void startGettingData() {
        if (!ConnectionUtil.isConnected(this)) {
            return;
        }
    }

}
