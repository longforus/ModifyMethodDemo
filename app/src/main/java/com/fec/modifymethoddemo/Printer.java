package com.fec.modifymethoddemo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by XQ Yang on 2017/8/4  15:22.
 * Description :
 */

public class Printer {
    public static void print(String string,Context context) {
        Toast.makeText(context,string, Toast.LENGTH_SHORT).show();
    }
}
