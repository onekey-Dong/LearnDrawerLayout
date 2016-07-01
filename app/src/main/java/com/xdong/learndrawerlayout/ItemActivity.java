package com.xdong.learndrawerlayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oneKey on 2016/6/30.
 */
public class ItemActivity extends AppCompatActivity{

    private RecyclerView mItemRecyclerView;
    private ItemRecyclerAdapter mItemRecyclerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_activity);

        Toolbar toolbar = (Toolbar) findViewById(R.id.item_toolbar);
        toolbar.setTitle("fuck you");
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        CollapsingToolbarLayout collapsingTool = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        collapsingTool.setTitle("Item");
        collapsingTool.setCollapsedTitleTextColor(Color.WHITE);
        collapsingTool.setExpandedTitleColor(Color.WHITE);
        collapsingTool.setExpandedTitleGravity(Gravity.RIGHT|Gravity.BOTTOM);

       // mItemRecyclerView = (RecyclerView) findViewById(R.id.item_recyclerview);
//        mItemRecyclerAdapter = new ItemRecyclerAdapter();
//        mItemRecyclerView.setLayoutManager(new LinearLayoutManager(ItemActivity.this));
//        mItemRecyclerView.setAdapter(mItemRecyclerAdapter);
    }

    private List<String> getDataList(int count){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++){
            list.add("Good Luck. " + i);
        }
        return list;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
