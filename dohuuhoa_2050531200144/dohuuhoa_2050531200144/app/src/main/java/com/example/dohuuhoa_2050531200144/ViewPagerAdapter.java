package com.example.dohuuhoa_2050531200144;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new profileFragment();
            case 1:
                return new listFragment();
            default:
                return new profileFragment();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}

