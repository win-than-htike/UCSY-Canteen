package com.studyjam.ucsycanteen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView restList;
    private RestaurantRvAdapter restaurantRvAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        restList = (RecyclerView)findViewById(R.id.restaurant_list);
        restList.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        restList.setLayoutManager(layoutManager);
        restaurantRvAdapter = new RestaurantRvAdapter(getApplicationContext(),getData());
        restList.setAdapter(restaurantRvAdapter);


    }

    private List<Restaurant> getData() {

        String[] restName = {"Su","La Min Thar","New World","We.Com"};
        int[] restLogo = {R.drawable.shop,R.drawable.shop,R.drawable.shop,R.drawable.shop};

        List<Restaurant> list = new ArrayList<>();

        for (int i = 0; i < restLogo.length ; i++){

            Restaurant item = new Restaurant();
            item.setImageId(restLogo[i]);
            item.setRestName(restName[i]);
            list.add(item);

        }

        return list;

    }
}
