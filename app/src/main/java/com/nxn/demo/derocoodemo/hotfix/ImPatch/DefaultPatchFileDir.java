package com.nxn.demo.derocoodemo.hotfix.ImPatch;

import android.Manifest;
import android.os.Environment;

import com.nxn.demo.derocoodemo.hotfix.IPatch.IPatchFileDir;
import com.nxn.demo.derocoodemo.util.MAppManager;
import com.nxn.demo.derocoodemo.util.MPermissionUtil;

import java.io.File;

/**
 * 默认patch 路径管理
 * Created by shoyu666@163.com on 16/7/5.
 */
public class DefaultPatchFileDir implements IPatchFileDir {
    public static final String PachDir = "nxndemopatch";
    @Override
    public File getPatchJarDir() {
        return getHotFixPachDir();
    }

    @Override
    public File getCurrentPatchJar() {
        return new File(getPatchJarDir(),getPatchFileName());
        //return getHotFixPachDirSDKCard();
    }

    @Override
    public String getPatchFileName() {
        return "patch.jar";
    }

    public static File getHotFixPachDir() {
        File file= new File(MAppManager.getApplication().getFilesDir(), PachDir);
        if(file!=null&&!file.exists()){
            file.mkdirs();
        }
        return file;
    }

    /**
     * path放在sd卡上
     * @return
     */
    public static File getHotFixPachDirSDKCard() {
        if(!MPermissionUtil.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)&&!MPermissionUtil.checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)){
            return new File(getSDCardPath(),PachDir);
        }
        return getHotFixPachDir();
    }
     public static String getSDCardPath(){
        return Environment.getExternalStorageDirectory().getAbsolutePath()+ File.separator;
    }
}
