package com.novoda.textpager.fragments;

import com.novoda.textpager.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class Text extends Fragment {
    
    private TextView textView;
    private String text;
    
    public static Fragment newInstance(String text) {
        Text fragment = new Text();
        fragment.text = text;
        return fragment;
    }

    public Text() {
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        HorizontalScrollView view = (HorizontalScrollView) inflater.inflate(R.layout.fragment_text, container, false);
        textView = (TextView)view.findViewById(R.id.text);
        return view;
    }
    
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView.setText(text);
    }

}
