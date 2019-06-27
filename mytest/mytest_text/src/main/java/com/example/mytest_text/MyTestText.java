package com.example.mytest_text;

import com.taobao.weex.WXSDKEngine;
import com.alibaba.fastjson.JSONObject;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;


public class MyTestText extends WXSDKEngine.DestroyableModule {
    public String NAME = "name";
    public String VALUE = "value";
    @Override
    public void destroy() {

    }
    @JSMethod(uiThread = true)
    public void add(JSONObject options, JSCallback jsCallback) {
        System.out.println("WWWWWWW-WWWWW");
        String name = options.getString(NAME);
        String value = options.getString(VALUE);
        JSONObject result = new JSONObject();
        result.put("result",name+value);
        jsCallback.invoke(result);
    }
}
