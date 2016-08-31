package com.wjf.dynamicapploader.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wjf.dynamicapploader.R;
import com.wjf.dynamicapploader.model.ServerApkItem;

import java.util.ArrayList;

/**
 * description
 *
 * @author weijianfeng @Hangzhou Youzan Technology Co.Ltd
 * @date 16/8/31
 */
public class ServerApkListAdapter extends RecyclerView.Adapter<ServerApkItemViewHolder> {

    private ArrayList<ServerApkItem> mServerApkItems;
    private Activity mActivity;

    public ServerApkListAdapter(Activity activity) {
        mActivity = activity;
        mServerApkItems = new ArrayList<>();
    }


    @Override
    public ServerApkItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_server_apk, parent, false);
        return new ServerApkItemViewHolder(mActivity, view);
    }

    @Override
    public void onBindViewHolder(ServerApkItemViewHolder holder, int position) {
        holder.bindTo(mServerApkItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mServerApkItems.size();
    }

    public void addItem(ServerApkItem serverApkItem) {
        mServerApkItems.add(serverApkItem);
        notifyDataSetChanged();
    }
}
