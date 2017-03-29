package com.dyx.ssp;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dyx.ssp.view.StatusBarCompat;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * project name：Stillness-StateBar-Project
 * class describe：
 * create person：dayongxin
 * create time：16/7/25 上午11:11
 * alter person：dayongxin
 * alter time：16/7/25 上午11:11
 * alter remark：
 */
public class UnarmedComplishAct extends AppCompatActivity {
    @Bind(R.id.id_toolbar)
    Toolbar idToolbar;
    @Bind(R.id.id_tv_content)
    TextView idTvContent;
    @Bind(R.id.id_main_content)
    LinearLayout idMainContent;
    @Bind(R.id.id_nv_menu)
    NavigationView idNvMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_unarmed_complish_layout);
        ButterKnife.bind(this);

        setSupportActionBar(idToolbar);

        StatusBarCompat.compat(this);
    }
}
