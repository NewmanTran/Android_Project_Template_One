package com.nghiatv.androidprojecttemplateone.util;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */
public class KeyboardUtil {

    public static void showKeyboard(Context context, View v) {
        InputMethodManager imm = (InputMethodManager)
                context.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (v.requestFocus()) {
            imm.showSoftInput(v, InputMethodManager.SHOW_IMPLICIT);
        }
    }

    public static void hideKeyboard(Context context, View v) {
        InputMethodManager imm = (InputMethodManager)
                context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }
}
