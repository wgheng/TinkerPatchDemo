package com.wgheng.tinkerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tinkerpatch.sdk.TinkerPatch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //启动时强制检查下发更新
        TinkerPatch.with().fetchPatchUpdate(true);
    }

}
