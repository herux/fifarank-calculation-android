package com.herux.fifarankcalc;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CountryTeamAdapter extends ArrayAdapter<CountryTeam> {
	Activity activity;
	
	public CountryTeamAdapter(Activity activity, int textViewResourceId, ArrayList<CountryTeam> countryTeams) {
		super(activity, textViewResourceId, countryTeams);
		this.activity = activity;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = activity.getLayoutInflater();
		View row = inflater.inflate(R.layout.country_row, parent, false);
		TextView tvName = (TextView) row.findViewById(R.id.tvCountryTeamName);
		
		tvName.setText(getItem(position).getName());
		return row;
	}

}
