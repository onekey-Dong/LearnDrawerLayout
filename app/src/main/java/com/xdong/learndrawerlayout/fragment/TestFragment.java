package com.xdong.learndrawerlayout.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xdong.learndrawerlayout.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oneKey on 2016/6/30.
 */
public class TestFragment extends Fragment{

    private static final  String TAG = "TestFragment";
    String mInfo;
    private List<String> mList;
    private RecyclerView mRecyclerView;

    public static Fragment newInstance(Context context, String info){
        Bundle bundle = new Bundle();
        bundle.putString("INFO", info);
        return Fragment.instantiate(context, TestFragment.class.getName(), bundle);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mInfo = getArguments().getString("INFO");
        mList = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            mList.add("good  luck." + i);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.test_fragment, null);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_recyclerview);
        TestRecyclerAdapter adapter = new TestRecyclerAdapter(mList);
        //grid 布局，第二个参数是列数。
        //mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(adapter);

        adapter.setOnItemClicker(new TestRecyclerAdapter.OnItemClicker() {
            @Override
            public void onItemClick(View view, int position) {
                Log.i(TAG,"View: "+view+" index:"+position);
            }
        });
    }
}
