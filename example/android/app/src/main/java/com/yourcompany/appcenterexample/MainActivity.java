package com.yourcompany.appcenterexample;

import android.os.Bundle;

import com.microsoft.appcenter.AppCenter;

import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    AppCenter.setLogLevel(android.util.Log.VERBOSE);
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(this);
  }
}
