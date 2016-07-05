package com.nxn.demo.derocoodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.nxn.demo.derocoodemo.hotfix.HotFixManger;
import com.nxn.demo.derocoodemo.hotfix.PatchUpdateInfo;
import com.nxn.demo.derocoodemo.hotfix.PatchManger;
import com.nxn.demo.derocoodemo.util.MAppInfoManager;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PatchUpdateInfo mock = PatchUpdateInfo.mock;
        if(mock.targetVersion== MAppInfoManager.getVersionCode(this)&&!mock.newPatchMd5.equals(getCurrentPatchMd5())){
            //更新patch
            HotFixManger.updatePatchJar();
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
     * @return
     */
    private String getCurrentPatchMd5() {
        File ff = PatchManger.getGlobalPatchManger().patchFileDir.getCurrentPatchJar();
        //TODO
        return "ssssssssssssss";
    }
}
