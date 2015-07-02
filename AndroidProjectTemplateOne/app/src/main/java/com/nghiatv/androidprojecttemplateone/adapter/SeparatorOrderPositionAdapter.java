package com.nghiatv.androidprojecttemplateone.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Copyright © 2015 AsianTech inc.
 * Created by NghiaTV on 6/24/15.
 */

public class SeparatorOrderPositionAdapter extends BaseAdapter {

    private ArrayList<BaseAdapter> adapters;

    public SeparatorOrderPositionAdapter(Context context) {
        adapters = new ArrayList<BaseAdapter>();
    }

    public void addAdapter(BaseAdapter adapter) {
        adapters.add(adapter);
    }

    @Override
    public int getCount() {
        int total = 0;

        for (Adapter adapter : adapters) {
            total += adapter.getCount();
        }

        return total;
    }

    @Override
    public Object getItem(int position) {
        for (Adapter adapter : adapters) {
            int size = adapter.getCount();
            if (position < size) {
                return adapter.getItem(position);
            }
            position -= size;
        }

        return null;
    }

    @Override
    public void notifyDataSetChanged() {
        for (BaseAdapter adapter : adapters) {
            adapter.notifyDataSetChanged();
        }
        super.notifyDataSetChanged();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        int total = 0;

        for (Adapter adapter : adapters) {
            total += adapter.getViewTypeCount();
        }

        return total;
    }

    @Override
    public int getItemViewType(int position) {
        int type = 0;

        for (Adapter adapter : adapters) {
            int size = adapter.getCount();

            if (position < size) {
                return type + adapter.getItemViewType(position);
            }

            position -= size;
            type += adapter.getViewTypeCount();
        }

        return -1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        for (Adapter adapter : adapters) {
            int size = adapter.getCount();

            if (position < size) {
                return adapter.getView(position, convertView, parent);
            }

            position -= size;
        }

        return null;
    }

}
