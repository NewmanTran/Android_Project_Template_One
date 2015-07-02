package com.nghiatv.androidprojecttemplateone.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */
public class ScreenUtil {

    /**
     * This method is used to get height of screen
     *
     * @param context is current context
     * @return return height screen in pixel
     */
    public static int getHeightScreen(Context context) {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /**
     * This method is used to get width of screen
     *
     * @param context is current context
     * @return return width of screen in pixel
     */
    public static int getWidthScreen(Context context) {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /**
     * This method is used to convert dp to pixel
     *
     * @param context is current context
     * @param dp      is value you want to convert for
     * @return return value in pixel
     */
    public static int convertDPToPixels(Context context, int dp) {
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (dp * density);
    }
}