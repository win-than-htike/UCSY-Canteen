package com.studyjam.ucsycanteen.ui.activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.studyjam.ucsycanteen.R;
import com.studyjam.ucsycanteen.ui.adapter.TabPagerAdapter;

/**
 * Created by winthanhtike on 2/21/16.
 */
public class SuRestaurantDetail extends AppCompatActivity {

    private Toolbar toolbar;
    private ImageView imageView;
    private TextView tvToolbarTitle;
    private CollapsingToolbarLayout collapsingToolbar;
    private TabPagerAdapter tabPagerAdapter;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private Typeface custom_font;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_detail);

        custom_font = Typeface.createFromAsset(getAssets(), "zawgyione.ttf");

        imageView = (ImageView) findViewById(R.id.image_view);
        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitleEnabled(false);

        toolbarAndTitle();

        viewpagerAndTabs();

        setImage();

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if (position == 0) {
                    imageView.setImageResource(R.drawable.food);
                } else {
                    imageView.setImageResource(R.drawable.drink);
                }

                imageView.invalidate();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    public void viewpagerAndTabs(){

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mTabLayout = (TabLayout) findViewById(R.id.detail_tab);
        tabPagerAdapter = new TabPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(tabPagerAdapter);
        mTabLayout.setTabsFromPagerAdapter(tabPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }

    public void toolbarAndTitle(){

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tvToolbarTitle = (TextView) findViewById(R.id.toolbar_title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvToolbarTitle.setText("ဆု");
        tvToolbarTitle.setTypeface(custom_font);

    }

    private void setImage() {
        imageView.setImageResource(R.drawable.food);
    }

}

