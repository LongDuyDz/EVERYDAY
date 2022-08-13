package com.example.everyday.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.everyday.Activity.Adapter.RecentAdapter;
import com.example.everyday.Activity.model.RecentsData;
import com.example.everyday.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recentRecycler;
    RecentAdapter recentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("03", "TUE","A slow but sure star",R.drawable.rectangle2));
        recentsDataList.add(new RecentsData("02", "MON","First working dayn of the new year!",R.drawable.rectangle2));
        recentsDataList.add(new RecentsData("04", "SUN","What a way to nstart the year :)",R.drawable.rectangle2));
        recentsDataList.add(new RecentsData("05", "SUN","What a way to nstart the year :)",R.drawable.rectangle2));
        recentsDataList.add(new RecentsData("06", "SUN","What a way to nstart the year :)",R.drawable.rectangle2));
//        setRecentRecycler(recentsDataList);
        recentRecycler = findViewById(R.id.recent_post);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentAdapter = new RecentAdapter(this, recentsDataList);
        recentRecycler.setLayoutManager(layoutManager);
        recentRecycler.setAdapter(recentAdapter);
    }

    private  void   setRecentRecycler(List<RecentsData> recentsDataList){


    }
}