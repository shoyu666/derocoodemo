package com.nxn.demo.derocoodemo.hotfix.IPatch;

import java.io.File;

/**
 * Created by shoyu666@163.com on 16/7/5.
 */
public interface IPatchFileDir {
    public File getPatchJarDir();
    public File getCurrentPatchJar();
    public String getPatchFileName();
}
