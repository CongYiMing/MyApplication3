package com.example.myapplication3;

import android.util.Log;

public class Crash {
    public static String TAG = "lmy";

    public static void crash() {
        Log.i(TAG, "1.2版本改动");
        Log.i(TAG, "改动之后代码行数 就对不上了，但是方法和类还是能找到的  在方法和类中推测崩溃原因");
        int i = 1 / 0;
        Log.i(TAG, "i:" + i);
    }
}
