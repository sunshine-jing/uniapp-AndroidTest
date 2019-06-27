package com.example.mytest_text;

import android.app.Application;

import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

import io.dcloud.weex.AppHookProxy;

public class MyTest_AppProxy  implements AppHookProxy {
    @Override
    public void onCreate(Application application) {
    }
}
