package com.studyjam.ucsycanteen.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.studyjam.ucsycanteen.R;
import com.studyjam.ucsycanteen.model.Restaurant;
import com.studyjam.ucsycanteen.ui.adapter.RestaurantRvAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView su,lamin,newworld,wecom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        su = (ImageView)findViewById(R.id.su_res);
        lamin = (ImageView)findViewById(R.id.lamin_res);
        newworld = (ImageView)findViewById(R.id.newworld_res);
        wecom = (ImageView)findViewById(R.id.wecom_res);

        su.setOnClickListener(this);
        lamin.setOnClickListener(this);
        newworld.setOnClickListener(this);
        wecom.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.su_res:
                startActivity(new Intent(MainActivity.this,SuRestaurantDetail.class));
                break;

            case R.id.lamin_res:
                startActivity(new Intent(MainActivity.this,LaMinTharRestaurantDetail.class));
                break;

        }

    }
}
