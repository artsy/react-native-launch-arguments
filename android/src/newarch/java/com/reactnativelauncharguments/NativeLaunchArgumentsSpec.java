package com.reactnativelauncharguments;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;

import androidx.annotation.Nullable;

public abstract class NativeLaunchArgumentsSpec extends ReactContextBaseJavaModule {
    public NativeLaunchArgumentsSpec(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Nullable
    public abstract Map<String, Object> getConstants();

    /**
     * Dummy method for backwards compatibility
     */
    @ReactMethod
    public void foo() {}
}
