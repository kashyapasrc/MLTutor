package com.kashyap.mltutor.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.kashyap.mltutor.R;
import com.kashyap.mltutor.interfaces.ContentClickListeners;
import com.kashyap.mltutor.models.ContentModel;

public class ContentViewHolder extends RecyclerView.ViewHolder {

    private TextView mContentTitleTextView;
    private ContentModel mModel;
    private int mPosition;

    public ContentViewHolder(View itemView) {
        super(itemView);
        mContentTitleTextView = itemView.findViewById(R.id.item_content_textview_content_title);

    }

    public void onBind(ContentModel model, int position) {
        this.mModel = model;
        this.mPosition = position;
        mContentTitleTextView.setText(model.getContentTitle());

    }

    public void setClickListener(final ContentClickListeners mContentClickListeners) {
        mContentTitleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mContentClickListeners != null)
                    mContentClickListeners.onContentItemClick(mModel, getAdapterPosition());
            }
        });
    }
}
