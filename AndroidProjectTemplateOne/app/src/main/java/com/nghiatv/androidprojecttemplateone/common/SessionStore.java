package com.nghiatv.androidprojecttemplateone.common;

import android.content.Context;

import com.nghiatv.androidprojecttemplateone.util.SharedPreferenceUtil;


/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */
public class SessionStore {
    public static final String FRAG_TUTORIAL_ACTIVITY = "fragtutorialactivity";

    private static SessionStore mInstance;

    private SessionStore() {

    }

    public static SessionStore getInstance() {
        if (mInstance == null) {
            mInstance = new SessionStore();
        }

        return mInstance;
    }

    public boolean getInitAppSession(Context context) {
        return SharedPreferenceUtil.getBoolean(context, FRAG_TUTORIAL_ACTIVITY);
    }

    public void setInitAppSession(Context context, boolean value) {
        SharedPreferenceUtil.saveBoolean(context, FRAG_TUTORIAL_ACTIVITY, value);
    }
}
