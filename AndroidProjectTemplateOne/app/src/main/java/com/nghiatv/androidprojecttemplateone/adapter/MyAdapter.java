package com.nghiatv.androidprojecttemplateone.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements View.OnClickListener {
    public static final String TAG = MyAdapter.class.getSimpleName();

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View v) {
            super(v);
        }
    }

    private Context mContext;

    public MyAdapter(Context context) {
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(0, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();


    }
}
