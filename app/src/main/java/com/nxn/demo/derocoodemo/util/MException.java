package com.nxn.demo.derocoodemo.util;

import com.androidquery.callback.AjaxStatus;

public class MException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public MException(String msg){
    	super(msg);
    }
    
    public static MException getMException(String url, AjaxStatus status, int RequestCode){
    	String msg = status.getMessage()+"<"+status.getCode()+"><"+url+">";
    	return new MException(msg);
    }
}