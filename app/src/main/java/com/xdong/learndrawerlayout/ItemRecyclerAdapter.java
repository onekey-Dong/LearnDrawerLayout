package com.xdong.learndrawerlayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by oneKey on 2016/7/1.
 */
public class ItemRecyclerAdapter extends RecyclerView.Adapter<ItemRecyclerAdapter.ItemViewHolder>{

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_card_item,parent,false);
        return new ItemViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;

        public ItemViewHolder(View itemView) {
            super(itemView);
        }
    }
}
