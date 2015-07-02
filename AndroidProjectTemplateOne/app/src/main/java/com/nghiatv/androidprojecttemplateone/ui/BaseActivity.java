package com.nghiatv.androidprojecttemplateone.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */
public abstract class BaseActivity extends AppCompatActivity {
    public static final String TAG = BaseActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        init();
        setValue();
        setListener();
    }

    /**
     * Get the id of content view
     *
     * @return return id of content view
     */
    public abstract int getContentView();

    /**
     * Init all members variable in this method include views
     */
    public abstract void init();

    /**
     * Set the default value or attribute for variable members
     */
    public abstract void setValue();

    /**
     * Set event for views
     */
    public abstract void setListener();
}
