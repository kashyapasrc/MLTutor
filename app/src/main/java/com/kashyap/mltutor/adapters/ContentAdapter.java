package com.kashyap.mltutor.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kashyap.mltutor.R;
import com.kashyap.mltutor.viewholders.ContentViewHolder;

public class ContentAdapter extends RecyclerView.Adapter<ContentViewHolder> {


    @NonNull
    @Override
    public ContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_content, parent, false);

        return new ContentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContentViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
