package com.example.ming.helloandroid.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ming.helloandroid.R;

/**
 * Created by ming on 2016/12/13.
 */

public class HotFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        View view =inflater.inflate(R.layout.fragment_hot,container,false);
        return  view;
    }
}
