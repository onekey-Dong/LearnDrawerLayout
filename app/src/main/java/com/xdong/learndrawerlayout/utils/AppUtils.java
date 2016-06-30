package com.xdong.learndrawerlayout.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by oneKey on 2016/6/30.
 */
public class AppUtils {

    public static final void showToast(Context context, String info){
        Toast.makeText(context, info, Toast.LENGTH_SHORT).show();
    }
}
