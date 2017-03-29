package com.dyx.ssp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dyx.ssp.view.ColorPicker;
import com.readystatesoftware.systembartint.SystemBarTintManager;

/**
 * project name：Stillness-StateBar-Project
 * class describe：
 * create person：dayongxin
 * create time：16/7/25 上午10:16
 * alter person：dayongxin
 * alter time：16/7/25 上午10:16
 * alter remark：
 */
public class ColorAct extends Activity {
    private SystemBarTintManager tintManager;
    private Button mButton;
    private ColorPicker mColorPicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_color_layout);


        /**
         * 初始化SystemBarTint
         */
        tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setNavigationBarTintEnabled(true);

        mColorPicker = (ColorPicker) findViewById(R.id.color_picker);

        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                useSelectedColor();
            }
        });


        useSelectedColor();
    }


    private void useSelectedColor() {
        int selectedColorIndex = mColorPicker.getColor();
        int color = Color.argb(153, Color.red(selectedColorIndex), Color.green(selectedColorIndex), Color.blue(selectedColorIndex));
        tintManager.setTintColor(color);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        useSelectedColor();
    }


}
