package com.novoda.textpager.adapters;

import java.util.HashMap;

import com.novoda.textpager.fragments.Text;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TextPagerAdapter extends FragmentPagerAdapter {

    private HashMap<Integer, String> map;

    public TextPagerAdapter(FragmentManager fm, HashMap<Integer, String> map) {
        super(fm);
        this.map = map;
    }

    @Override
    public Fragment getItem(int position) {
        return Text.newInstance(map.get(position));
    }

    @Override
    public int getCount() {
        return map.size();
    }

}
