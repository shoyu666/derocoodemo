package com.nxn.demo.derocoodemo;

import android.app.Application;
import android.content.Context;

import com.nxn.demo.derocoodemo.hotfix.HotFixManger;
import com.nxn.demo.derocoodemo.util.MAppManager;

/**
 * Created by shoyu666@163.com on 16/7/5.
 */
public class MyApplicaton extends Application{
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MAppManager.init(this);
        HotFixManger.init(this);
    }
}
