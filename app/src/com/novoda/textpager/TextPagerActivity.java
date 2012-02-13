package com.novoda.textpager;



import java.util.HashMap;

import com.novoda.textpager.adapters.TextPagerAdapter;
import com.novoda.textpager.view.CustomViewPager;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;

public class TextPagerActivity extends FragmentActivity {
    
    private CustomViewPager pager;
    private static final HashMap<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(1, "hdjklasdhfjklhdfjkasdhfkjasdhkjfasdh\ndfhjksdhfjkfhksdjhfasdjfhsjkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        map.put(2, "33455667674o576i345876095685689\ndfhjksdhfjkfhksdjhfsadhfjkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkka");
        map.put(3, "9999999999999999999999999999999999999999\ndfhjksdhfjkfhksdjhfajkdfhskjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjf");
    }
    
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        pager = (CustomViewPager) findViewById(R.id.pager);
        TextPagerAdapter adapter = new TextPagerAdapter(getSupportFragmentManager(), map);
        pager.setAdapter(adapter);
        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {            
            @Override
            public void onPageSelected(int position) {
                if (position == 1) {
                    pager.setChildId(R.id.scroll);
                } else {
                    pager.setChildId(0);
                }
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    
    }
}