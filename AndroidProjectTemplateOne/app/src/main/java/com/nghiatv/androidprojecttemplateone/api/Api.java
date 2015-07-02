package com.nghiatv.androidprojecttemplateone.api;

import android.content.Context;

import retrofit.RestAdapter;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */
public class Api {

    private static final String HOST = "base_api_url";
    private static RestAdapter sRestAdapter;

    public static void init(Context context) {
        sRestAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.NONE)
                .setEndpoint(HOST).build();
    }

    public static ApiRequest getInstance() {
        if (sRestAdapter == null) {
            throw new RuntimeException("You have to call init Api before using!");
        }
        return sRestAdapter.create(ApiRequest.class);
    }

}
