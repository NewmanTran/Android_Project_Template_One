package com.nghiatv.androidprojecttemplateone.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */
public class SharedPreferenceUtil {

    public static final String SHARE_PREFERENCE_DATA = "share_preference_data";

    /**
     * Save string value to share preference
     *
     * @param context
     * @param key
     * @param value
     */
    public static void saveString(Context context, String key, String value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                SHARE_PREFERENCE_DATA, Context.MODE_PRIVATE);
        Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    /**
     * Get string from share preference
     *
     * @param context
     * @param key
     * @return
     */
    public static String getString(Context context, String key) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                SHARE_PREFERENCE_DATA, Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, "");
    }

    /**
     * Save boolean value to share preference
     *
     * @param context
     * @param key
     * @param value
     */
    public static void saveBoolean(Context context, String key, boolean value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                SHARE_PREFERENCE_DATA, Context.MODE_PRIVATE);
        Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    /**
     * Get boolean value from share preference
     *
     * @param context
     * @param key
     * @return
     */
    public static boolean getBoolean(Context context, String key) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                SHARE_PREFERENCE_DATA, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(key, true);
    }

    /**
     * Save integer value to share preference
     *
     * @param context
     * @param key
     * @param value
     */
    public static void saveInt(Context context, String key, int value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                SHARE_PREFERENCE_DATA, Context.MODE_PRIVATE);
        Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    /**
     * Get integer value from share preference
     *
     * @param context
     * @param key
     * @return
     */
    public static int getInt(Context context, String key) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                SHARE_PREFERENCE_DATA, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(key, 0);
    }

}
