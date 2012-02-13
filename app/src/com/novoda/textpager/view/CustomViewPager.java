package com.novoda.textpager.view;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class CustomViewPager extends ViewPager {

	private int childId;

	public CustomViewPager(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public CustomViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent event) {
		if (childId > 0) {
			View scroll = findViewById(childId);
			if (scroll != null) {
				Rect rect = new Rect();
				scroll.getHitRect(rect);
				if (rect.contains((int) event.getX(), (int) event.getY())) {
					Log.i("XXX", "X = " + event.getX() + " Y = " + event.getY());
					return false;
				}
			}
		}
		return super.onInterceptTouchEvent(event);
	}

	public void setChildId(int id) {
		this.childId = id;
	}

}
