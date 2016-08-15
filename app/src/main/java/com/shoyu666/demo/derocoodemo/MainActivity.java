package com.shoyu666.demo.derocoodemo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.shoyu666.demo.derocoodemo.hookdemo.Test;
import com.shoyu666.demo.derocoodemo.hotfix.PatchManger;
import com.shoyu666.demo.derocoodemo.hotfix.PatchUpdateInfo;
import com.shoyu666.demo.derocoodemo.util.MAppInfoManager;
import com.shoyu666.demo.derocoodemo.util.MAppManager;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainActivity extends BasePermissionActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.textView);
        File patchJarDir = PatchManger.globalPatchManger.get().patchFileDir.getPatchJarDir();
        tv.setText(Test.getText() + " 补丁初始化路径" + (patchJarDir != null ? patchJarDir.getAbsolutePath() : " error"));
        PatchUpdateInfo mock = PatchUpdateInfo.mock;
        if (mock.targetVersion == MAppInfoManager.getVersionCode(this) && !mock.newPatchMd5.equals(getCurrentPatchMd5())) {
            //更新patch
//            HotFixManger.updatePatchJar();
        }
        this.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HelloHack hack = new HelloHack();
                Toast.makeText(MainActivity.this, hack.showHello(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * 获得当前Patch.jar Md5
     *
     * @return
     */
    private String getCurrentPatchMd5() {
        String md5 = null;
        File ff = PatchManger.globalPatchManger.get().patchFileDir.getCurrentPatchJar();
        try {
            md5 = DigestUtils.md5Hex(new FileInputStream(ff));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return md5;
    }


    @Override
    public void onBackPressed() {
        // LxApplication.exit();
        MAppManager.AppExit(this);
    }
}
