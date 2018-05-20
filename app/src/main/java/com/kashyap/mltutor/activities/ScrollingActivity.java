package com.kashyap.mltutor.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.kashyap.mltutor.R;
import com.kashyap.mltutor.models.ContentModel;
import com.kashyap.mltutor.utils.Constants;

import uk.co.deanwild.flowtextview.FlowTextView;

public class ScrollingActivity extends AppCompatActivity {

    CollapsingToolbarLayout toolbar_layout;
    Toolbar toolbar;
    ContentModel mContentModel;
    FlowTextView flowTextView;

    public static Intent getIntent(Context context) {
        return new Intent(context, ScrollingActivity.class);
    }

    public static Intent getIntentWithNewTask(Context context) {
        Intent intent = getIntent(context);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        initUI();
        setSupportActionBar(toolbar);
        if (getIntent() != null) {
            mContentModel = (ContentModel) getIntent().getSerializableExtra(Constants.CONTENT_KEY);
        }
        if (mContentModel != null) {
            toolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));
            toolbar.setTitle(mContentModel.getContentTitle());

            flowTextView.setText(getString(R.string.large_text));
            flowTextView.setTextSize(25);

        }
    }

    private void initUI() {
        toolbar = findViewById(R.id.toolbar);
        toolbar_layout = findViewById(R.id.toolbar_layout);
        flowTextView = (FlowTextView) findViewById(R.id.ftv);
    }

    public void onStart() {
        super.onStart();
    }


    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void onStop() {
        super.onStop();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

}
