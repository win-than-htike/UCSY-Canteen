package com.studyjam.ucsycanteen.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.studyjam.ucsycanteen.R;
import com.studyjam.ucsycanteen.model.Drink;

import java.util.Collections;
import java.util.List;

/**
 * Created by winthanhtike on 2/21/16.
 */
public class DrinkListRvAdapter extends RecyclerView.Adapter<DrinkListRvAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private Context context;
    private List<Drink> drinkData = Collections.emptyList();

    public DrinkListRvAdapter(Context context, List<Drink> drinkData) {
        this.context = context;
        this.drinkData = drinkData;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public DrinkListRvAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.food_list_item,parent,false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(DrinkListRvAdapter.ViewHolder holder, int position) {

        Drink item = drinkData.get(position);
        holder.drinkName.setText(item.getDrinkName());
        holder.drinkPrice.setText(item.getDrinkPrice());

    }

    @Override
    public int getItemCount() {
        return drinkData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView drinkName,drinkPrice;

        public ViewHolder(View itemView) {
            super(itemView);

            drinkName = (TextView)itemView.findViewById(R.id.food);
            drinkPrice = (TextView)itemView.findViewById(R.id.food_price);

        }
    }
}
