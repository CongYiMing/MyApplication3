package com.example.myapplication3;

import android.util.Log;

public class Crash {
    public static String TAG = "lmy";

    public static void crash() {
        int i = 1 / 0;
        Log.i(TAG, "i:" + i);
    }
}
