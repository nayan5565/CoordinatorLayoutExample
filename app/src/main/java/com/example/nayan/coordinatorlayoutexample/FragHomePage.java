package com.example.nayan.coordinatorlayoutexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragHomePage extends Fragment {
    private View view;

    public static FragHomePage newInstance() {
        return new FragHomePage();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.test_frag, container, false);
        return view;
    }
}
