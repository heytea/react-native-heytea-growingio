package com.heytea.growingio;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.growingio.android.plugin.rn.base.GioRnApi;
import com.growingio.android.plugin.rn.base.GrowingIOTrackModule;
import com.growingio.android.plugin.rn.base.RnUtils;
import com.growingio.android.sdk.collection.GInternal;
import com.growingio.android.sdk.collection.GrowingIO;
import com.growingio.android.sdk.utils.ThreadUtils;

import org.json.JSONException;

/**
 * Package     ：com.heytea.growingio
 * Description ：无用代码
 * Company     ：Heytea
 * Author      ：Created by ChengGuang
 * CreateTime  ：2020-04-01.
 */
public class HeyteaGrowingIOTrackModule extends ReactContextBaseJavaModule implements LifecycleEventListener, GioRnApi {

    private final String ModuleName = "GrowingIO";
    private final String TAG = "GIO.TrackModule";


    public HeyteaGrowingIOTrackModule(@NonNull ReactApplicationContext reactContext) {
        super(reactContext);
        reactContext.addLifecycleEventListener(this);
        GInternal.getInstance().addFeaturesVersion(new String[]{"rt", "1"});    }

    public String getName() {
        return "GrowingIO";
    }

    @ReactMethod
    public void track(final String eventId, final ReadableMap eventLevelVariable) {
        ThreadUtils.postOnUiThread(new Runnable() {
            public void run() {
                try {
                    if (eventLevelVariable == null) {
                        GrowingIO.getInstance().track(eventId);
                    } else {
                        GrowingIO.getInstance().track(eventId, RnUtils.convertMapToJson(eventLevelVariable));
                    }
                } catch (JSONException var2) {
                    Log.e("GIO.TrackModule", "trackWithNumber:json格式解析错误");
                }

            }
        });
    }

    @ReactMethod
    public void trackWithNumber(final String eventId, final Double number, final ReadableMap eventLevelVariable) {
        ThreadUtils.postOnUiThread(new Runnable() {
            public void run() {
                try {
                    if (eventLevelVariable == null) {
                        GrowingIO.getInstance().track(eventId, number);
                    } else {
                        GrowingIO.getInstance().track(eventId, number, RnUtils.convertMapToJson(eventLevelVariable));
                    }
                } catch (JSONException var2) {
                    Log.e("GIO.TrackModule", "trackWithNumber:json格式解析错误");
                }

            }
        });
    }

    @ReactMethod
    public void setEvar(final ReadableMap conversionVariables) {
        ThreadUtils.postOnUiThread(new Runnable() {
            public void run() {
                try {
                    GrowingIO.getInstance().setEvar(RnUtils.convertMapToJson(conversionVariables));
                } catch (JSONException var2) {
                    Log.e("GIO.TrackModule", "setEvar:json格式解析错误");
                }

            }
        });
    }

    @ReactMethod
    public void setPeopleVariable(final ReadableMap peopleVariables) {
        ThreadUtils.postOnUiThread(new Runnable() {
            public void run() {
                try {
                    GrowingIO.getInstance().setPeopleVariable(RnUtils.convertMapToJson(peopleVariables));
                } catch (JSONException var2) {
                    Log.e("GIO.TrackModule", "setPeopleVariable:json格式解析错误");
                }

            }
        });
    }

    @ReactMethod
    public void setUserId(final String userId) {
        ThreadUtils.postOnUiThread(new Runnable() {
            public void run() {
                GrowingIO.getInstance().setUserId(userId);
            }
        });
    }

    @ReactMethod
    public void clearUserId() {
        ThreadUtils.postOnUiThread(new Runnable() {
            public void run() {
                GrowingIO.getInstance().clearUserId();
            }
        });
    }

    @ReactMethod
    public void setVisitor(final ReadableMap readableMap) {
        ThreadUtils.postOnUiThread(new Runnable() {
            public void run() {
                try {
                    GrowingIO.getInstance().setVisitor(RnUtils.convertMapToJson(readableMap));
                } catch (JSONException var2) {
                    Log.e("GIO.TrackModule", "setPeopleVariable:json格式解析错误");
                }

            }
        });
    }

    public void onHostResume() {
    }

    public void onHostPause() {
    }

    public void onHostDestroy() {
    }
}
