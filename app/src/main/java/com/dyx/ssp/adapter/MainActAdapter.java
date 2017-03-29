package com.dyx.ssp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dyx.ssp.R;

import java.util.List;

/**
 * project name：Stillness-StateBar-Project
 * class describe：
 * create person：dayongxin
 * create time：16/7/24 下午11:15
 * alter person：dayongxin
 * alter time：16/7/24 下午11:15
 * alter remark：
 */
public class MainActAdapter extends RecyclerView.Adapter<MainActAdapter.ItemViewHolder> {
    private List<String> mDataList;

    private OnRvItemClickListener mOnRvItemClickListener;

    public interface OnRvItemClickListener {
        void onRvItemClick(int pos);
    }

    public void setmOnRvItemClickListener(OnRvItemClickListener mOnRvItemClickListener) {
        this.mOnRvItemClickListener = mOnRvItemClickListener;
    }

    public MainActAdapter(List<String> mDataList) {
        this.mDataList = mDataList;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_main_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ItemViewHolder holder, int position) {
        holder.mTextView.setText(mDataList.get(position));
        if (mOnRvItemClickListener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = holder.getLayoutPosition();
                    mOnRvItemClickListener.onRvItemClick(pos);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        public ItemViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.tv_item);
        }
    }
}
