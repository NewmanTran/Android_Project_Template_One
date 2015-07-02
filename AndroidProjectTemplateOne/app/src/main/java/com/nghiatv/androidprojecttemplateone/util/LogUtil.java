package com.nghiatv.androidprojecttemplateone.util;

import android.util.Log;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 5/27/15.
 */
public class LogUtil {

    private static final boolean DEBUG = true;

    public static void d(String tag, String msg) {
        if (DEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (DEBUG) {
            Log.i(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (DEBUG) {
            Log.e(tag, msg);
        }
    }
}
