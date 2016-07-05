package com.shoyu666.demo.derocoodemo.util;

public class MExceptionManager {
	public static void throwApplictionInitEx(String msg){
		throw new MException(msg);
	}
}