package com.shoyu666.demo.derocoodemo.hotfix;

/**
 * Created by shoyu666@163.com on 16/7/5.
 */
public class PatchUpdateInfo {
    /**
     * 新版本md5
     */
    public String newPatchMd5;

    public PatchUpdateInfo(String md5, int targetVersion) {
        this.newPatchMd5 = md5;
        this.targetVersion = targetVersion;
    }

    /**
     * 针对的版本
     */
    public int targetVersion;
    public static PatchUpdateInfo mock = new PatchUpdateInfo("aadfasdfasdfasdfasdfasdf",1);
}
