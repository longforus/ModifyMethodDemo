package com.fec.modifymethoddemo;

import android.app.Application;
import android.util.Log;
import javassist.ClassClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

/**
 * Created by XQ Yang on 2017/8/4  15:28.
 * Description :
 */

public class App extends Application {
    private static final String TAG = "App";
    @Override
    public void onCreate() {
        super.onCreate();
        ClassPool pool = ClassPool.getDefault();
        ClassClassPath classPath = new ClassClassPath(this.getClass());
        pool.insertClassPath(classPath);

        try {
            CtClass ctClass = pool.get("com.fec.modifymethoddemo.App");
            Log.i(TAG, "onCreate: "+ctClass.getName());
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
    }
}
