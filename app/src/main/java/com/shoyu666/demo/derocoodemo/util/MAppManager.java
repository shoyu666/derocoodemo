package com.shoyu666.demo.derocoodemo.util;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;

import com.shoyu666.demo.derocoodemo.MainActivity;

/**
 * Created by shoyu666@163.com on 16/7/5.
 */
public class MAppManager {
    public static Application globalApplication;
	
	public static void init(Application application){
		globalApplication=application;
	}
	public static Application getApplication(){
		if(globalApplication==null){
			MExceptionManager.throwApplictionInitEx("please init application");
		}
		return globalApplication;
	}

		public  static void AppExit(Context context) {
			try {
				ActivityManager activityMgr = (ActivityManager) context
						.getSystemService(Context.ACTIVITY_SERVICE);
				activityMgr.killBackgroundProcesses(context.getPackageName());
				globalApplication=null;
				System.exit(0);
			} catch (Exception e) {
				System.exit(0);
			}
		}
}