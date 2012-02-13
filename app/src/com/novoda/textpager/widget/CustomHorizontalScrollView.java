package com.novoda.textpager.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;

public class CustomHorizontalScrollView extends HorizontalScrollView {
	
	OnTouchListener listener = new OnTouchListener() {
		
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			Log.i("XXXX", " X = " + event.getX() + " Y = " + event.getY());
			return false;
		}
	};
	
	public CustomHorizontalScrollView(Context context) {
		super(context);
		init();
	}

	public CustomHorizontalScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public CustomHorizontalScrollView(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
		init();
	}
	
	private void init(){
		this.setOnTouchListener(listener);
	}
}
