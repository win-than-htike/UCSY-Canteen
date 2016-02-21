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
import com.studyjam.ucsycanteen.model.Drink;
import com.studyjam.ucsycanteen.ui.adapter.DrinkListRvAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by winthanhtike on 2/21/16.
 */
public class DrinkFragment extends Fragment {

    private RecyclerView rv_drink;
    private DrinkListRvAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_drink,container,false);
        rv_drink = (RecyclerView)v.findViewById(R.id.drink_list);
        adapter = new DrinkListRvAdapter(getActivity(),getDrinkList());
        rv_drink.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_drink.setAdapter(adapter);
        return v;
    }

    private List<Drink> getDrinkList() {

        String[] drinkName = {"ထမင္းေၾကာ္","ၾကာဇံေၾကာ္","ေခါက္ဆြဲေၾကာ္","ဆီခ်က္","ေကာ္ရည္","ၾကက္ေပါင္း","ေခါက္ဆြဲၿပဳတ္","ထမင္းသုုတ္","မုန္႔ဟင္းခါး","ေခါက္ဆြဲသုပ္"};
        String[] drinkPrice = {"2000","2000","2000","2000","2000","2000","2000","2000","2000","2000"};

        List<Drink> drinkList = new ArrayList<>();

        for (int i = 0; i < drinkName.length; i++) {

            Drink item = new Drink();
            item.setDrinkName(drinkName[i]);
            item.setDrinkPrice(drinkPrice[i]);
            drinkList.add(item);

        }

        return drinkList;

    }
}
