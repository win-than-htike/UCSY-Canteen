package com.studyjam.ucsycanteen.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.studyjam.ucsycanteen.R;
import com.studyjam.ucsycanteen.model.Food;

import java.util.Collections;
import java.util.List;

/**
 * Created by winthanhtike on 2/21/16.
 */
public class FoodListRvAdapter extends RecyclerView.Adapter<FoodListRvAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private Context context;
    private List<Food> data = Collections.emptyList();

    public FoodListRvAdapter(Context context, List<Food> data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public FoodListRvAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.food_list_item,parent,false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(FoodListRvAdapter.MyViewHolder holder, int position) {

        Food item = data.get(position);
        holder.food.setText(item.getFood_name());
        holder.foodPrice.setText(item.getFood_price());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView food,foodPrice;

        public MyViewHolder(View itemView) {
            super(itemView);

            food = (TextView)itemView.findViewById(R.id.food);
            foodPrice = (TextView)itemView.findViewById(R.id.food_price);

        }
    }

}
