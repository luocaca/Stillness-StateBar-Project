package com.dyx.ssp;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.readystatesoftware.systembartint.SystemBarTintManager;

/**
 * project name：Stillness-StateBar-Project
 * class describe：
 * create person：dayongxin
 * create time：16/7/25 上午9:59
 * alter person：dayongxin
 * alter time：16/7/25 上午9:59
 * alter remark：
 */
public class ActionBarAct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_action_bar_layout);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            setTranslucentStatus(true);
        }

        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setStatusBarTintResource(R.color.colorAccent);
    }

    private void setTranslucentStatus(boolean b) {
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams = window.getAttributes();

        int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (b) {
            layoutParams.flags |= bits;
        } else {
            layoutParams.flags &= ~bits;
        }
        window.setAttributes(layoutParams);
    }
}
