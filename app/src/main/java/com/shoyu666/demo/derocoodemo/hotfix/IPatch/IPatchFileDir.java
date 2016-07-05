package com.shoyu666.demo.derocoodemo.hotfix.IPatch;

import java.io.File;

/**
 * Created by shoyu666@163.com on 16/7/5.
 */
public interface IPatchFileDir {
    /**
     * 返回patch保存路径
     * @return
     */
    public File getPatchJarDir();

    /**
     * 返回当前的patch补丁文件,如果没有返回null
     * @return
     */
    public File getCurrentPatchJar();

    /**
     * 返回保存patch补丁的文件名
     * @return
     */
    public String getPatchFileName();
}
