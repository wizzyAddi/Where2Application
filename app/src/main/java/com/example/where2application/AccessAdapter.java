package com.example.where2application;
//NB: DO NOT EDIT THIS DOCUMENT
import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class AccessAdapter extends FragmentPagerAdapter {
    private Context context;
    int Tabs;

    public AccessAdapter(FragmentManager fm, Context context, int Tabs){
        super(fm);
        this.context = context;
        this.Tabs = Tabs;
    }

    @Override
    public int getCount() {
        return Tabs;
    }

    public Fragment getItem(int position){
        switch(position){
            case 0:
                LoginTabFragment loginTabFragment = new LoginTabFragment();
                return loginTabFragment;
            case 1:
                SignupTabFragment signupTabFragment = new SignupTabFragment();
                return signupTabFragment;
            default:
                return null;
        }
    }
}
//NB: DO NOT EDIT THIS DOCUMENT
