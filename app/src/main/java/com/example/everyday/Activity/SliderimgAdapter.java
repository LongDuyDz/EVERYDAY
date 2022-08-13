package com.example.everyday.Activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.example.everyday.Activity.model.Slider;
import com.example.everyday.R;

import java.util.List;

public class SliderimgAdapter extends PagerAdapter {

    private Context mContext;
    private List<Slider> mListSlider;

    public SliderimgAdapter(Context mContext, List<Slider> mListSlider) {
        this.mContext = mContext;
        this.mListSlider = mListSlider;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.item_slider, container,false);
        ImageView imgslider = view.findViewById(R.id.img_slider);

        Slider slider = mListSlider.get(position);
        if (slider != null){
            Glide.with(mContext).load(slider.getResourceId()).into(imgslider);
        }
        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        if (mListSlider != null){
            return mListSlider.size();
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
