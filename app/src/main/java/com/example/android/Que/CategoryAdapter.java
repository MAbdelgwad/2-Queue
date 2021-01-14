package com.example.android.Que;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**{@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for each.*/
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**Create a new {@link CategoryAdapter} object.
       @param context is the context of the app
       @param fm is the fragment manager that will keep
       each fragment's state in the adapter across swipes.*/
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**Return the {@link Fragment} that should be displayed for the given page number.*/
    @Override
    public Fragment getItem(int position)
    {
        if      (position == 0) { return new D$D$1$Fragment(); }
        else if (position == 1) { return new D$D$1$K$Fragment(); }
        else if (position == 2) { return new M$M$1$Fragment(); }
        else                    { return new M$M$1$K$Fragment(); }
    }

    /**Return the total number of pages.*/
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        if      (position == 0) { return "D/D/1"; }
        else if (position == 1) { return "D/D/1/k"; }
        else if (position == 2) { return "M/M/1"; }
        else                    { return "M/M/1/k"; }
    }
}