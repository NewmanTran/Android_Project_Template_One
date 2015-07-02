package com.nghiatv.androidprojecttemplateone.api;

import android.content.Context;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */
public class ApiError {

    private Context mContext;
    private RetrofitError mError;

    public ApiError(Context context, RetrofitError error) {
        mContext = context;
        mError = error;
    }

    public void resolveError() {
        if (mError == null) {
            resolveOtherError();
            return;
        }

        Response response = mError.getResponse();
        if (response == null) {
            resolveOtherError();
            return;
        }

        int code = response.getStatus();
        String jsonString = new String(((TypedByteArray) response.getBody()).getBytes());
        if ("".equals(jsonString)) {
            resolveOtherError();
            return;
        }

        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            Toast.makeText(mContext, jsonObject.getString("error"), Toast.LENGTH_SHORT).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void resolveOtherError() {
        Toast.makeText(mContext, "Other error!", Toast.LENGTH_SHORT).show();
    }
}
