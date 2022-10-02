package com.zoontek.rnlocalize;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;

import java.lang.reflect.Method;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

@ReactModule(name = RNLocalizeModuleImpl.MODULE_NAME)
public class RNLocalizeModule extends ReactContextBaseJavaModule {
  private RNLocalizeModuleImpl implementation;

  public RNLocalizeModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.implementation = new RNLocalizeModuleImpl(reactContext);
  }

  @NonNull
  @Override
  public String getName() {
    return RNLocalizeModuleImpl.MODULE_NAME;
  }

  @Override
  public @Nullable Map<String, Object> getConstants() {
    return implementation.getConstants();
  }

  @Override
  public void initialize() {
    super.initialize();
    implementation.initialize();
  }

  @Override
  public void onCatalystInstanceDestroy() {
    super.onCatalystInstanceDestroy();
    implementation.onCatalystInstanceDestroy();
  }

  @ReactMethod
  public void addListener(String eventName) {
    // Set up any upstream listeners or background tasks as necessary
  }

  @ReactMethod
  public void removeListeners(double count) {
    // Remove upstream listeners, stop unnecessary background tasks
  }
}
