package com.sahrul_f55121040.myfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentAccount extends Fragment {
    View view;
    public FragmentAccount(){
    }
    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, Bundle saveInstanceState){
        view = inflater.inflate(R.layout.accountfragment, container, false);
        return view;
    }
}
