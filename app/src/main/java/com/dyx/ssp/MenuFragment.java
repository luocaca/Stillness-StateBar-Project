package com.dyx.ssp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * project name：Stillness-StateBar-Project
 * class describe：
 * create person：dayongxin
 * create time：16/7/25 下午1:58
 * alter person：dayongxin
 * alter time：16/7/25 下午1:58
 * alter remark：
 */
public class MenuFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return new FrameLayout(getActivity());
    }
}
