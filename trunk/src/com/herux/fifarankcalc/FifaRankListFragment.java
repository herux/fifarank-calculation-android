package com.herux.fifarankcalc;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

public class FifaRankListFragment extends ListFragment {
	CountryTeamAdapter ca;
	ArrayList<CountryTeam> countryTeams;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		countryTeams = new ArrayList<CountryTeam>();

		ca = new CountryTeamAdapter(getActivity(), R.layout.country_row, countryTeams);
		setListAdapter(ca);
	}

}
