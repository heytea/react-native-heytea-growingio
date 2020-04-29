package com.heytea.growingio;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.growingio.android.plugin.rn.GrowingIOPackage;
import com.growingio.android.plugin.rn.base.GrowingIOTrackModule;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Package     ：com.heytea.growingio
 * Description ：无用代码
 * Company     ：Heytea
 * Author      ：Created by ChengGuang
 * CreateTime  ：2020-04-01.
 */
public class HeyteaGrowingioPackage implements ReactPackage {


    public HeyteaGrowingioPackage() {
    }

    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Arrays.asList(new NativeModule[]{new HeyteaGrowingIOTrackModule(reactContext)});
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }
}
