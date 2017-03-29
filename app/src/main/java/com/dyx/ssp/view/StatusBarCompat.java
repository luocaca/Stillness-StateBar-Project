package com.dyx.ssp.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/**
 * project name：Stillness-StateBar-Project
 * class describe：
 * create person：dayongxin
 * create time：16/7/25 下午1:35
 * alter person：dayongxin
 * alter time：16/7/25 下午1:35
 * alter remark：
 */
public class StatusBarCompat {
    /**
     * 无效的值
     */
    private static final int INVALID_VAL = -1;
    /**
     * 默认的颜色
     */
    private static final int COLOR_DEFAULT = Color.parseColor("#20000000");

    public static void compat(Activity activity) {
        compat(activity, INVALID_VAL);
    }

    public static void compat(Activity activity, int invalidVal) {
        /**
         * 5.0以上
         */
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (invalidVal != INVALID_VAL) {
                activity.getWindow().setStatusBarColor(invalidVal);
            }
            return;
        }
        /**
         * 4.4-5.0
         */
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT && Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            int color = COLOR_DEFAULT;
            //获取根ViewGroup
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(android.R.id.content);
            if (invalidVal != INVALID_VAL) {
                color = invalidVal;
            }
            //获取根布局第一个视图
            View statusBarView = viewGroup.getChildAt(0);
            if (statusBarView != null && statusBarView.getMeasuredHeight() == getStatusBarHeight(activity)) {
                statusBarView.setBackgroundColor(color);
                return;
            }
            //创建View对象
            statusBarView = new View(activity);
            ViewGroup.LayoutParams vlp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, getStatusBarHeight(activity));
            statusBarView.setBackgroundColor(color);

            viewGroup.addView(statusBarView, vlp);
        }
    }

    /**
     * 获取状态栏高度
     *
     * @param
     * @return
     */
    private static int getStatusBarHeight(Context context) {
        int result = 0;
        int resId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resId > 0) {
            result = context.getResources().getDimensionPixelSize(resId);
        }
        return result;
    }
}
