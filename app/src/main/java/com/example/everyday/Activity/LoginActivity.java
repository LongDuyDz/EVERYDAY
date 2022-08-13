package com.example.everyday.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.everyday.Activity.model.Slider;
import com.example.everyday.R;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class LoginActivity extends AppCompatActivity  {
    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    private SliderimgAdapter sliderimgAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        viewPager = findViewById(R.id.viewslider);
        circleIndicator =findViewById(R.id.circle_indicator);

        sliderimgAdapter = new SliderimgAdapter(this,getListSlider());
        viewPager.setAdapter(sliderimgAdapter);

        circleIndicator.setViewPager(viewPager);
        sliderimgAdapter.registerDataSetObserver(circleIndicator.getDataSetObserver());
    }
    private List<Slider> getListSlider(){
        List<Slider> list = new ArrayList<>();
        list.add(new Slider(R.drawable.slide1));
        list.add(new Slider(R.drawable.slide2));
        list.add(new Slider(R.drawable.slide3));
        return list;
    }



    public void login_up(View view) {
        startActivity(new Intent(LoginActivity.this,MainActivity.class));
    }

    public void sign_up(View view) {
        startActivity(new Intent(LoginActivity.this,MainActivity.class));
    }

    public void login_gg(View view) {
        startActivity(new Intent(LoginActivity.this,MainActivity.class));
    }

    public void login_fb(View view) {
        startActivity(new Intent(LoginActivity.this,MainActivity.class));
    }
}