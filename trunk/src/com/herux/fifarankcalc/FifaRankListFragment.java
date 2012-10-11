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
		CountryTeam ct = new CountryTeam();
		ct.setName("nama team 1");
		ct.setPoint(1000);
		ct.setPos("naik");
		ct.setRankingNo(1);
		countryTeams.add(ct);
		
		ct = new CountryTeam();
		ct.setName("nama team 2");
		ct.setPoint(1000);
		ct.setPos("naik");
		ct.setRankingNo(2);
		countryTeams.add(ct);
		
		ct = new CountryTeam();
		ct.setName("nama team 3");
		ct.setPoint(1000);
		ct.setPos("naik");
		ct.setRankingNo(3);
		countryTeams.add(ct);

		ca = new CountryTeamAdapter(getActivity(), R.layout.country_row, countryTeams);
		setListAdapter(ca);
	}

}
