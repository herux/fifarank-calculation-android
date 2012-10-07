package com.herux.fifarankcalc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FifaRankFragmentPagerAdapter extends FragmentPagerAdapter {
	protected static final String[] CONTENT = new String[] { "This", "Is", "A", "Test", };
	private int mCount = CONTENT.length;

	public FifaRankFragmentPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		return FifaRankFragment.newInstance(CONTENT[position % CONTENT.length]);
	}

	@Override
	public int getCount() {
		return mCount;
	}
	
	@Override
    public CharSequence getPageTitle(int position) {
      return FifaRankFragmentPagerAdapter.CONTENT[position % CONTENT.length];
    }

    public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }

}
