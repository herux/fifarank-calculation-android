package com.herux.fifarankcalc;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.viewpagerindicator.LinePageIndicator;
import com.viewpagerindicator.PageIndicator;

public class MainActivity extends FragmentActivity {
	FifaRankFragmentPagerAdapter mAdapter;
    ViewPager mPager;
    PageIndicator mIndicator;

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
    	StrictMode.setThreadPolicy(policy); 
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mAdapter = new FifaRankFragmentPagerAdapter(getSupportFragmentManager());
        FifaRankFragment rankListFragment = new FifaRankFragment();
        rankListFragment.setTitle("List Rank");
        mAdapter.AddFragment(rankListFragment);
        rankListFragment = new FifaRankFragment();
        mAdapter.AddFragment(rankListFragment);
        
        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);
        mIndicator = (LinePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
        
//        Document doc = null;
//		try {
//			doc = Jsoup.connect("http://www.fifa.com/worldranking/rankingtable/gender=M/rank=219/confederation=0/page=1/_ranking_table.html").get();
//		} catch (IOException e) {
//			Toast.makeText(MainActivity.this, "Can't connect to FIFA sites", Toast.LENGTH_LONG).show();
//			finish();
//		}
//		
//        for (Element e : doc.select("table[id=tbl_rankingTable] > tbody > tr")) {
//            if (e.children().size() >= 0) {
////            	Element img = e.child(4).select("img").first();
//                Log.d("FIFARank", e.child(1).text() + ":" + e.child(2).text()+ ":" + e.child(3).text()+ ":" );
//            }
//        }
		
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
}
