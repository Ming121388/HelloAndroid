package com.example.ming.helloandroid.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.example.ming.helloandroid.R;

/**
 * Created by ming on 2016/12/13.
 */

public class HomeFragment extends Fragment {
    private SliderLayout mSliderLayout;
    private PagerIndicator indicator;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        View view =inflater.inflate(R.layout.fragment_home,container,false);
        mSliderLayout =(SliderLayout) view.findViewById(R.id.slider);
        indicator=(PagerIndicator) view.findViewById(R.id.custom_indicator);

        initSlider();
        return  view;
    }
    private void initSlider(){
        TextSliderView textSliderView1=new TextSliderView(this.getActivity());
        TextSliderView textSliderView2=new TextSliderView(this.getActivity());
        TextSliderView textSliderView3=new TextSliderView(this.getActivity());
        textSliderView1.image("http://pic.58pic.com/58pic/13/60/28/57H58PIC8V9_1024.jpg");
        textSliderView2.image("http://pic35.nipic.com/20131121/2531170_145358633000_2.jpg");
        textSliderView3.image("http://img02.tooopen.com/images/20140127/sy_54827852166.jpg");


        mSliderLayout.addSlider(textSliderView1);
        mSliderLayout.addSlider(textSliderView2);
        mSliderLayout.addSlider(textSliderView3);

        mSliderLayout.setCustomIndicator(indicator);
       // mSliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mSliderLayout.setCustomAnimation(new DescriptionAnimation());
        mSliderLayout.setPresetTransformer(SliderLayout.Transformer.RotateUp);
        mSliderLayout.setDuration(3000);


    }

}
