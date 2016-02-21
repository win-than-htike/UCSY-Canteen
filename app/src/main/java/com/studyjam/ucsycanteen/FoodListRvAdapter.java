package com.studyjam.ucsycanteen;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by winthanhtike on 2/21/16.
 */
public class FoodListRvAdapter extends RecyclerView.Adapter<FoodListRvAdapter.MyViewHolder> {

    @Override
    public FoodListRvAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(FoodListRvAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);

        }
    }

}
