package com.shoyu666.demo.derocoodemo;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;

import com.shoyu666.demo.derocoodemo.util.MPermissionUtil;

/**
 * Created by shoyu666@163.com on 16-6-20.
 */
public abstract class BasePermissionActivity extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //签署短信自动填充
        MPermissionUtil.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        if (requestCode == MPermissionUtil.RequestCode) {

        }
    }
}
