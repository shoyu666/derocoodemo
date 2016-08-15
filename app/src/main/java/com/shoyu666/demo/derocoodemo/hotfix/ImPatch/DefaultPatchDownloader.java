package com.shoyu666.demo.derocoodemo.hotfix.ImPatch;

import android.util.Log;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.AjaxStatus;
import com.shoyu666.demo.derocoodemo.hotfix.IPatch.IPatchDownloader;
import com.shoyu666.demo.derocoodemo.hotfix.PatchManger;
import com.shoyu666.demo.derocoodemo.util.MAppManager;

import java.io.File;

/**
 * patch下载默认实现
 * Created by shoyu666@163.com on 16/7/5.
 */
public class DefaultPatchDownloader implements IPatchDownloader {
    public static final String TAG = "DefaultPatchDownloader";

    @Override
    public void downloadPatch() {
        downloadRemotePach();
    }

    @Override
    public String getUrl() {
        return "";
    }

    /**
     * 下载pach
     *
     * @param
     */
    private void downloadRemotePach() {
        File pachDir = PatchManger.globalPatchManger.get().patchFileDir.getPatchJarDir();
        if (pachDir != null && pachDir.exists()) {
            File temp = new File(pachDir, "temp.jar");
            if (temp.exists()) {
                temp.delete();
            }
            AQuery aq = new AQuery(MAppManager.getApplication());
            aq.download(getUrl(), temp, new AjaxCallback<File>() {
                @Override
                public void callback(String url, File object, AjaxStatus status) {
                    super.callback(url, object, status);
                    if (status.getCode() == 200) {
                        File current = PatchManger.globalPatchManger.get().patchFileDir.getCurrentPatchJar();
                        if (current.exists() && current.delete()) {
                            object.renameTo(current);
                        }
                        Log.d(TAG, "down load patch success ");
                    } else {
                        Log.e(TAG, "down load patch  error" + status.getMessage());
                    }
                }
            });
            //
        }
    }
}
