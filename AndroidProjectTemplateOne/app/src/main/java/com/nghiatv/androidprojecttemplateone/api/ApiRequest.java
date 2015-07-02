package com.nghiatv.androidprojecttemplateone.api;


import com.twitter.sdk.android.core.models.User;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */
public interface ApiRequest {

    @GET("/users/{userId}")
    void getUserInfo(@Path("userId") String userId, Callback<User> response);

    @GET("/api/v3/app/topic/koes/1c57a1d488cea804d126cef4e8c0f1267b72615")
    void getMyPage(Callback<User> response);

}
