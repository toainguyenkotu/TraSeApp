package com.example.trasea.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.trasea.fragments.AddFrag;
import com.example.trasea.fragments.FragmentStorageImagePost;
import com.example.trasea.fragments.FragmentStorageImageTag;
import com.example.trasea.fragments.HomeFrag;
import com.example.trasea.fragments.NotificationFrag;
import com.example.trasea.fragments.ProfileFrag;
import com.example.trasea.fragments.SearchFrag;

public class ViewPagerStorageImageAdapter extends FragmentStatePagerAdapter {

    int noOfTabs;

    public ViewPagerStorageImageAdapter(@NonNull FragmentManager fm, int noOfTabs) {
        super(fm);
        this.noOfTabs =noOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                return new FragmentStorageImagePost();

            case 1:
                return new FragmentStorageImageTag();

            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return noOfTabs;
    }
}
