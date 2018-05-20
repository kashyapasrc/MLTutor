package com.kashyap.mltutor.models;

import static com.kashyap.mltutor.utils.Constants.EMPTY;

public class ContentModel {


    private int mId = 0;
    private String mContentTitle = EMPTY;
    private int mContentImage;
    private String mContentMessage = EMPTY;


    public ContentModel(int mId, String mContentTitle, int mContentImage, String mContentMessage) {
        this.mId = mId;
        this.mContentTitle = mContentTitle;
        this.mContentImage = mContentImage;
        this.mContentMessage = mContentMessage;
    }


    public int getContentImage() {
        return mContentImage;
    }

    public void setContentImage(int mContentImage) {
        this.mContentImage = mContentImage;
    }

    public String getContentMessage() {
        return mContentMessage;
    }

    public void setContentMessage(String mContentMessage) {
        this.mContentMessage = mContentMessage;
    }

    public String getContentTitle() {
        return mContentTitle;
    }

    public void setContentTitle(String mContentTitle) {
        this.mContentTitle = mContentTitle;
    }
}
