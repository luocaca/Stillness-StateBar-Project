package com.dyx.ssp;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dyx.ssp.adapter.MainActAdapter;
import com.dyx.ssp.view.DividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.rv_main)
    RecyclerView rvMain;
    private MainActAdapter mMainActAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setBarStyle();
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

//        SystemBarTintManager tintManager = new SystemBarTintManager(this);
//        tintManager.setStatusBarTintEnabled(true);
//        tintManager.setNavigationBarTintEnabled(true);


        mMainActAdapter = new MainActAdapter(getDatas());
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setHasFixedSize(true);
        rvMain.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
        rvMain.setAdapter(mMainActAdapter);
    }

    /**
     * 设置透明状态栏，设置此属性的Activity的最顶部布局需设置 android:fitsSystemWindows="true" 属性
     * 以确保状态栏颜色和界面第一个控件背景色一样，否则状态栏背景颜色为界面背景色
     * 如果想以图片为背景时，不要设置此属性
     * android:fitsSystemWindows="true" 属性 控件不占用系统控件位置（例如状态栏，导航栏）
     * 特别注意：根控件为 DrawerLayout时，应为内容布局的适当位置（例如Title布局中，根布局）设置此属性，抽屉布局设置此属性无效（文章后面有举例），自己注意设置paddingTop或marginTop
     */
    public void setBarStyle() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            // 设置状态栏透明
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }


    private List<String> getDatas() {
        List<String> datas = new ArrayList<>();
        datas.add("mainactivity" +
                "");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        return datas;
    }

//    @Override
//    protected int getLayoutResId() {
//        return R.layout.activity_main;
//    }
}
