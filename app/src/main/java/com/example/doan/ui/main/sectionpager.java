package com.example.doan.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.doan.R;
import com.example.doan.bienbaocam;
import com.example.doan.bienbaohieulenh;
import com.example.doan.bienbaonguyhiem;
import com.example.doan.luatdibo;
import com.example.doan.luatxemay;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class sectionpager extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.luatxemay, R.string.luatdibo};
    private final Context mContext;

    public sectionpager(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position)
        {
            case(0):
                fragment =new luatxemay();
                break;
            case(1):
                fragment =new luatdibo();
                break;


        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}