package com.reactnativelauncharguments;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LaunchArgumentsModule extends NativeLaunchArgumentsSpec {

    public static final String NAME = "LaunchArguments";

    private LaunchArgumentsImpl implementation;

    LaunchArgumentsModule(ReactApplicationContext context) {
        super(context);
        this.implementation = new LaunchArgumentsImpl(context);
    }

    @NonNull
    @Override
    public String getName() {
        return NAME;
    }

    @Nullable
    @Override
    public Map<String, Object> getConstants() {
        return implementation.getConstants();
    }

    /**
     * Looks like a bug in RN, without it this module is invisible
     * in NativeModules.
     */
    @ReactMethod
    public void foo() {}
}
