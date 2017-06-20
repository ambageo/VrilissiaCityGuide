package com.example.android.vrilissiacityguide;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by georgeampartzidis on 8/6/17.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new VrilissiaFragment();
            case 1:
                return new CafesFragment();
            case 2:
                return new BarsFragment();
            case 3:
                return new RestaurantsFragment();
            case 4:
                return new ParksPlacesOfInterestFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.tab1);
            case 1:
                return mContext.getString(R.string.tab2);
            case 2:
                return mContext.getString(R.string.tab3);
            case 3:
                return mContext.getString(R.string.tab4);
            case 4:
                return mContext.getString(R.string.tab5);
            default:
                return null;

        }

    }
}
