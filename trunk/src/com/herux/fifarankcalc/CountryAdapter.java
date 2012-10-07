package com.herux.fifarankcalc;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CountryAdapter extends ArrayAdapter {
	Activity activity;
	
	public CountryAdapter(Activity activity, int textViewResourceId) {
		super(activity, textViewResourceId);
		this.activity = activity;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = activity.getLayoutInflater();
		View row = inflater.inflate(R.layout.country_row, parent, false);
		TextView tvName = (TextView) row.findViewById(R.id.tvName);
		return row;
	}

}
