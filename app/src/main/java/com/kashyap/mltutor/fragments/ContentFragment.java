package com.kashyap.mltutor.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kashyap.mltutor.R;
import com.kashyap.mltutor.activities.ScrollingActivity;
import com.kashyap.mltutor.adapters.ContentAdapter;
import com.kashyap.mltutor.interfaces.ContentClickListeners;
import com.kashyap.mltutor.models.ContentModel;

import java.util.ArrayList;

import static com.kashyap.mltutor.utils.Constants.CONTENT_KEY;

public class ContentFragment extends Fragment implements ContentClickListeners {


    private RecyclerView mRecyclerView;
    ContentAdapter mContentAdapter;
    private ArrayList<ContentModel> mContentModels;

    public static ContentFragment newInstance() {
        return new ContentFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_content, container, false);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initUI();
        initAdapter();
        prepareDataSet();

    }

    private void prepareDataSet() {
        String content[] = getResources().getStringArray(R.array.content_title);
        int i = 0;
        for (String s : content) {
            mContentModels.add(new ContentModel(i++, s, i, ""));
        }
        mContentAdapter.notifyDataSetChanged();

    }

    private void initAdapter() {
        mContentAdapter = new ContentAdapter(getContext(), mContentModels, this);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mContentAdapter);

    }

    private void initUI() {
        if (getView() != null)
            mRecyclerView = getView().findViewById(R.id.recycler_view);
        mContentModels = new ArrayList<>();
    }

    @Override
    public void onContentItemClick(ContentModel model, int position) {
        Intent intent = ScrollingActivity.getIntentWithNewTask(getContext());
        intent.putExtra(CONTENT_KEY, model);

        startActivity(intent);
    }
}
