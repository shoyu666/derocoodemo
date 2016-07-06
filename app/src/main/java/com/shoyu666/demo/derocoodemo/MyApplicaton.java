package com.shoyu666.demo.derocoodemo;

import android.app.Application;
import android.content.Context;

import com.dodola.rocoofix.RocooFix;
import com.shoyu666.demo.derocoodemo.hotfix.HotFixManger;
import com.shoyu666.demo.derocoodemo.util.MAppManager;

/**
 * Created by shoyu666@163.com on 16/7/5.
 */
public class MyApplicaton extends Application{
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MAppManager.init(this);
//        RocooFix.init(base);
//        RocooFix.initPathFromAssets(base,"patch.jar");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        RocooFix.init(this);
        RocooFix.initPathFromAssets(this,"patch.jar");
    }
}
