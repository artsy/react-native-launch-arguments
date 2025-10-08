package com.reactnativelauncharguments;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.TurboReactPackage;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class LaunchArgumentsPackage extends TurboReactPackage {

    @Nullable
    @Override
    public NativeModule getModule(String name, @Nonnull ReactApplicationContext reactContext) {
        if (name.equals(LaunchArgumentsModule.NAME)) {
            return new LaunchArgumentsModule(reactContext);
        } else {
            return null;
        }
    }

    @Override
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return () -> {
            final Map<String, ReactModuleInfo> moduleInfos = new HashMap<>();
            boolean isTurboModule = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED;
            moduleInfos.put(
                    LaunchArgumentsModule.NAME,
                    new ReactModuleInfo(
                            LaunchArgumentsModule.NAME,
                            LaunchArgumentsModule.NAME,
                            false, // canOverrideExistingModule
                            false, // needsEagerInit
                            true, // hasConstants
                            false, // isCxxModule
                            isTurboModule // isTurboModule
                    ));
            return moduleInfos;
        };
    }
}
