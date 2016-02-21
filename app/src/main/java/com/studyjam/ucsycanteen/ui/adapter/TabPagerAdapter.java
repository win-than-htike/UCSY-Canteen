package com.studyjam.ucsycanteen.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.studyjam.ucsycanteen.ui.fragment.FoodFragment;

/**
 * Created by winthanhtike on 2/21/16.
 */
public class TabPagerAdapter extends FragmentStatePagerAdapter{

    public TabPagerAdapter(FragmentManager fm) {super(fm);}

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                FoodFragment ffg = new FoodFragment();
                return ffg;

            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return 1;
    }

}
