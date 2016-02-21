package com.studyjam.ucsycanteen.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.studyjam.ucsycanteen.R;
import com.studyjam.ucsycanteen.model.Food;
import com.studyjam.ucsycanteen.ui.adapter.FoodListRvAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by winthanhtike on 2/21/16.
 */
public class FoodFragment extends Fragment {

    private RecyclerView rv_food;
    private FoodListRvAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_food,container,false);
        rv_food = (RecyclerView)v.findViewById(R.id.food_list);
        adapter = new FoodListRvAdapter(getActivity(),getFoodList());
        rv_food.setAdapter(adapter);
        rv_food.setLayoutManager(new LinearLayoutManager(getActivity()));
        return v;

    }

    private List<Food> getFoodList() {

        String[] foodName = {"ထမင္းေၾကာ္","ၾကာဇံေၾကာ္","ေခါက္ဆြဲေၾကာ္","ဆီခ်က္","ေကာ္ရည္","ၾကက္ေပါင္း","ေခါက္ဆြဲၿပဳတ္","ထမင္းသုုတ္","မုန္႔ဟင္းခါး","ေခါက္ဆြဲသုပ္"};
        String[] foodPrice = {"2000","2000","2000","2000","2000","2000","2000","2000","2000","2000"};

        List<Food> foodList = new ArrayList<>();

        for (int i = 0; i < foodName.length; i++) {

            Food item = new Food();
            item.setFood_name(foodName[i]);
            item.setFood_price(foodPrice[i]);
            foodList.add(item);

        }

        return foodList;

    }
}
