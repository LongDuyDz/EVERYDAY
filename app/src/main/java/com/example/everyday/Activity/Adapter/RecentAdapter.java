package com.example.everyday.Activity.Adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.everyday.Activity.model.RecentsData;
import com.example.everyday.R;

import java.util.List;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.RecentViewHolder> {
        Context context;
        List<RecentsData> recentsDtaList;

    public RecentAdapter(Context context, List<RecentsData> recentsDtaList) {
        this.context = context;
        this.recentsDtaList = recentsDtaList;
    }

    @NonNull
    @Override
    public RecentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_recent_adapter,parent,false);
        return  new RecentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentViewHolder holder, int position) {
        holder.tUe.setText(recentsDtaList.get(position).getTue());
        holder.soMe.setText(recentsDtaList.get(position).getSome());
        holder.bUt.setText(recentsDtaList.get(position).getBut());
        holder.imageView.setImageResource(recentsDtaList.get(position).getImageUrl());
    }

    @Override
    public int getItemCount() {
        return recentsDtaList.size();
    }


    public static final class RecentViewHolder extends RecyclerView.ViewHolder{
            ImageView imageView;
            TextView soMe, tUe, bUt;

            public RecentViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.rectangle2);
                soMe = itemView.findViewById(R.id.some_id);
                tUe= itemView.findViewById(R.id.tue);
                bUt = itemView.findViewById(R.id.a_slow_but_);
            }
        }
}