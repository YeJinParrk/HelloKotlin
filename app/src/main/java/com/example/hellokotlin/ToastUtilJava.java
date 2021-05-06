package com.example.hellokotlin;

import android.content.Context;
import android.widget.Toast;

public class ToastUtilJava {

    // MainApplication aObj = new MainApplication();
    public static void toast_short(String s) {
        Toast.makeText(MainApplication.get_appContext(),s, Toast.LENGTH_SHORT).show();
    }

    public static void toast_long(String s) {
        Toast.makeText(MainApplication.get_appContext(),s, Toast.LENGTH_SHORT).show();
    }
}