package com.novoda.textpager.adapters;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MergePagerAdapter extends FragmentPagerAdapter {

	private final List<FragmentPagerAdapter> list = new ArrayList<FragmentPagerAdapter>();

	public MergePagerAdapter(FragmentManager fm) {
		super(fm);
	}

	public void addAdapter(FragmentPagerAdapter item) {
		list.add(item);
	}

	@Override
	public Fragment getItem(int position) {
		for (FragmentPagerAdapter item : list) {
			int size = item.getCount();
			if (position < size) {
				return (item.getItem(position));
			}
			position -= size;
		}
		return (null);
	}

	@Override
	public int getCount() {
		int total = 0;
		for (FragmentPagerAdapter item : list) {
			total += item.getCount();
		}
		return (total);
	}

}
