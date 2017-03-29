package com.dyx.ssp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2017/3/29 0029.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
//
        setContentView(getLayoutResId());//把设置布局文件的操作交给继承的子类
//
//        ViewGroup contentFrameLayout = (ViewGroup) findViewById(Window.ID_ANDROID_CONTENT);
//        View parentView = contentFrameLayout.getChildAt(0);
//        if (parentView != null && Build.VERSION.SDK_INT >= 14) {
//            parentView.setFitsSystemWindows(true);
//        }
    }

    /**
     * 返回当前Activity布局文件的id
     *
     *@return
     */
    abstract protected int getLayoutResId();


}

