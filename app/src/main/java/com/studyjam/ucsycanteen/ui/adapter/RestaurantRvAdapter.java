package com.studyjam.ucsycanteen.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.studyjam.ucsycanteen.R;
import com.studyjam.ucsycanteen.model.Restaurant;

import java.util.Collections;
import java.util.List;

/**
 * Created by winthanhtike on 2/20/16.
 */
public class RestaurantRvAdapter extends RecyclerView.Adapter<RestaurantRvAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private Context context;
    private List<Restaurant> data = Collections.emptyList();

    public RestaurantRvAdapter(Context context, List<Restaurant> data) {

        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public RestaurantRvAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.restaurant_list_item,parent,false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RestaurantRvAdapter.ViewHolder holder, int position) {

        Restaurant item = data.get(position);
        holder.restLogo.setImageResource(item.getImageId());
        holder.restName.setText(item.getRestName());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView restLogo;
        private TextView restName;

        public ViewHolder(View itemView) {
            super(itemView);

            restLogo = (ImageView)itemView.findViewById(R.id.restaurant_logo);
            restName = (TextView)itemView.findViewById(R.id.restaurant_name);

        }
    }
}
