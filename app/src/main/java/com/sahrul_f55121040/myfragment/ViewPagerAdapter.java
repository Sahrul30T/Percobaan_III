package com.sahrul_f55121040.myfragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter implements ViewAdapter {
    private final List<Fragment> fragmentList = new ArrayList<>();
    private final  List<String> FragmenListTitles = new ArrayList<>();
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }
    @Override
    public int getCount(){
        return FragmenListTitles.size();
    }
    @Override
    public Fragment getItem(int position){
        return fragmentList.get(position);
    }


    @Nullable
    @Override
    public CharSequence getPageTitle (int position){
        return FragmenListTitles.get(position);
    }


    @Override
    public void AddFragment(Fragment fragment, String Title){
        fragmentList.add(fragment);
        FragmenListTitles.add(Title);
    }
}
