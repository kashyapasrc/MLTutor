package com.kashyap.mltutor.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kashyap.mltutor.R;
import com.kashyap.mltutor.interfaces.ContentClickListeners;
import com.kashyap.mltutor.models.ContentModel;
import com.kashyap.mltutor.viewholders.ContentViewHolder;

import java.util.ArrayList;

public class ContentAdapter extends RecyclerView.Adapter<ContentViewHolder> {


    private final ArrayList<ContentModel> mConentModels;
    private final Context mContext;
    private final ContentClickListeners mContentClickListeners;

    public ContentAdapter(Context context, ArrayList<ContentModel> contentModels, ContentClickListeners contentClickListeners) {
        this.mContext = context;
        this.mConentModels = contentModels;
        this.mContentClickListeners=contentClickListeners;

    }


    @NonNull
    @Override
    public ContentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_content, parent, false);

        return new ContentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContentViewHolder holder, int position) {

        holder.onBind(mConentModels.get(position), position);
        holder.setClickListener(mContentClickListeners);
    }

    @Override
    public int getItemCount() {
        return mConentModels.size();
    }
}
