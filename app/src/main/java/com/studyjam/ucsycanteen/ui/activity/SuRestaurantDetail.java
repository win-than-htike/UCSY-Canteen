package com.studyjam.ucsycanteen.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.studyjam.ucsycanteen.R;
import com.studyjam.ucsycanteen.ui.adapter.TabPagerAdapter;

/**
 * Created by winthanhtike on 2/21/16.
 */
public class SuRestaurantDetail extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageView imageView,tabBg;
    private CollapsingToolbarLayout collapsingToolbar;
    private TabPagerAdapter tabPagerAdapter;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_detail);

        imageView= (ImageView) findViewById(R.id.imgae_view);
        tabBg= (ImageView) findViewById(R.id.tabBg);
        collapsingToolbar=(CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);

        setToolbar();
        setImage();

        mViewPager= (ViewPager) findViewById(R.id.viewpager);
        mTabLayout= (TabLayout) findViewById(R.id.detail_tab);
        tabPagerAdapter=new TabPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(tabPagerAdapter);
        mTabLayout.setTabsFromPagerAdapter(tabPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position==0){
                    Glide.with(SuRestaurantDetail.this).load(R.drawable.onet).into(imageView);
                    Glide.with(SuRestaurantDetail.this).load(R.drawable.oneb).into(tabBg);
                } else {
                    Glide.with(SuRestaurantDetail.this).load(R.drawable.twot).into(imageView);
                    Glide.with(SuRestaurantDetail.this).load(R.drawable.twob).into(tabBg);
                }

                imageView.invalidate();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    private void setToolbar() {
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
    }

    private void setImage() {
        Glide.with(this).load(R.drawable.onet).into(imageView);
        Glide.with(SuRestaurantDetail.this).load(R.drawable.oneb).into(tabBg);
    }

}

