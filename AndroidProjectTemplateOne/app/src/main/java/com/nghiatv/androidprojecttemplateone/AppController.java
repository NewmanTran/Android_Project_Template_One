package com.nghiatv.androidprojecttemplateone;

import android.app.Application;

import com.nghiatv.androidprojecttemplateone.api.Api;
import com.squareup.picasso.LruCache;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import io.fabric.sdk.android.Fabric;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */
public class AppController extends Application {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "U6hHr5NKmrDV4hp4WcahowWa1";
    private static final String TWITTER_SECRET = "9H4lhFgp1o9zjpttAskqL2dqclx2Sncr8jstmH9cU5WYwVwaIA";


    @Override
    public void onCreate() {
        super.onCreate();
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));

        // Init api instance
        Api.init(getApplicationContext());

        // Setting Picasso
        int maxMemoryCache = (int) (Runtime.getRuntime().maxMemory() / 10);
        new Picasso.Builder(getApplicationContext()).memoryCache(new LruCache(maxMemoryCache)).build();
    }
}
