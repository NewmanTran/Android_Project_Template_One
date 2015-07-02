package com.nghiatv.androidprojecttemplateone.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class SeparatorRandomPositionAdapter extends BaseAdapter {
	
	private Map<Integer, Adapter> sections;
	
	private ArrayList<Integer> types;
	
	public SeparatorRandomPositionAdapter(Context context, ArrayList<Integer> types) {
		sections = new LinkedHashMap<Integer, Adapter>();
		this.types = types;
	}
	
	public void clearData() {
		types.clear();
	}
	
	public boolean removeItem(int type, int position) {
		int index = -1;
		int length = types.size();
		
		for (int i = 0; i < length; i++) {
			if (types.get(i).equals(type)) {
				index++;
				
				if (index == position) {
					types.remove(i);
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void addAdapter(int type, Adapter adapter) {
		sections.put(type, adapter);
	}
	
	public void addTypes(int type) {
		types.add(type);
	}

	@Override
	public int getCount() {
		return types.size();
	}
	
	@Override
	public int getViewTypeCount() {
		int total = 0;
		
		for (Adapter adapter : sections.values()) {
			total += adapter.getViewTypeCount();
		}
		
		return total;
	}
	
	@Override
	public int getItemViewType(int position) {
		return types.get(position);
	}

	@Override
	public Object getItem(int position) {
		int type = getItemViewType(position);
		
		Adapter adapter = sections.get(type);
		
		return adapter.getItem(getPositionInAdapter(position));
	}
	
	public int getPositionInAdapter(int position) {
		int count = -1;
		int type = getItemViewType(position);
		
		for (int i = 0; i <= position; i++) {
			if (type == getItemViewType(i)) {
				count++;
			}
		}
		
		if (count == -1) {
			count = 0;
		}
		return count;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return sections.get(getItemViewType(position)).getView(
				getPositionInAdapter(position), convertView, parent);
	}
	
}
