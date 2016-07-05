package com.nxn.demo.derocoodemo.hotfix.IPatch;

/**
 * Created by shoyu666@163.com on 16/7/5.
 */
public interface IPatchDownloader {
    /**
     * patch下载操作
     */
    public void downloadPatch();

    /**
     * patch文件下载地址
     * @return
     */
    public String getUrl();
}
