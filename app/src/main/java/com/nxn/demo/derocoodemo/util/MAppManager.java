package com.nxn.demo.derocoodemo.util;

import android.app.Application;

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
}