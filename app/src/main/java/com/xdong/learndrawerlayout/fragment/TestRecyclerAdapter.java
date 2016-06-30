package com.xdong.learndrawerlayout.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xdong.learndrawerlayout.R;

import java.util.List;

/**
 * Created by oneKey on 2016/6/30.
 */
public class TestRecyclerAdapter extends RecyclerView.Adapter<TestRecyclerAdapter.ViewHolder> {

    private static final String TAG = "TestRecyclerAdapter";
    private List<String> mList;
    private OnItemClicker mOnItemClicker;

    public TestRecyclerAdapter(List<String> list) {
        mList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.getTextView().setText(mList.get(position));

        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnItemClicker.onItemClick(v,position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.adapter_item);
        }

        public TextView getTextView() {
            return textView;
        }
    }

    public interface OnItemClicker{
        void onItemClick(View view,int position);
    }

    public void setOnItemClicker(OnItemClicker clicker){
        mOnItemClicker = clicker;
    }
}
