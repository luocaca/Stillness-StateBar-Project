package com.dyx.ssp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dyx.ssp.adapter.MainActAdapter;
import com.dyx.ssp.view.DividerItemDecoration;

import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * project name：Stillness-StateBar-Project
 * class describe：
 * create person：dayongxin
 * create time：16/7/25 下午2:29
 * alter person：dayongxin
 * alter time：16/7/25 下午2:29
 * alter remark：
 */
public class MenuAct extends Activity {
    @Bind(R.id.rv_menu)
    RecyclerView rvMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_menu_layout);
        ButterKnife.bind(this);
        List<String> menuDatas = Arrays.asList(getResources().getStringArray(R.array.menu));

        rvMenu.setHasFixedSize(true);
        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        rvMenu.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
        MainActAdapter actAdapter = new MainActAdapter(menuDatas);
        rvMenu.setAdapter(actAdapter);

        actAdapter.setmOnRvItemClickListener(new MainActAdapter.OnRvItemClickListener() {
            @Override
            public void onRvItemClick(int pos) {
                switch (pos) {
                    case 0:
                        intentTo(MainActivity.class);
                        break;
                    case 1:
                        intentTo(ActionBarAct.class);
                        break;
                    case 2:
                        intentTo(ColorAct.class);
                        break;
                    case 3:
                        intentTo(UnarmedComplishAct.class);
                        break;
                }
            }
        });
    }

    private void intentTo(Class<?> cla) {
        startActivity(new Intent(this, cla));
    }
}
