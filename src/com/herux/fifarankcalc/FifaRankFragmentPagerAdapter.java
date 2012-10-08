package com.herux.fifarankcalc;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FifaRankFragmentPagerAdapter extends FragmentPagerAdapter {
	protected static final String[] CONTENT = new String[] { "This", "Is", "A", "Test", };
	private List<FifaRankFragment> fragments = null;

	public FifaRankFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
		fragments = new ArrayList<FifaRankFragment>();
	}
	
	public void AddFragment(FifaRankFragment fragment){
		fragments.add(fragment);
	}

	@Override
	public Fragment getItem(int position) {
		return fragments.get(position);
//		return FifaRankFragment.newInstance(CONTENT[position % CONTENT.length]);
	}

	@Override
	public int getCount() {
		return fragments.size();
	}
	
	@Override
    public CharSequence getPageTitle(int position) {
      return fragments.get(position).getTitle();
    }
}
