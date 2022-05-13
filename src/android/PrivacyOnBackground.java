package com.fibotech.privacyonbackground;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.os.Bundle;

/**
 * Clase que establece el flag FLAG_SECURE cuando el app esta en pausa
 */
public class PrivacyOnBackground extends CordovaPlugin {

    @Override
    public void onPause(boolean multitasking) {
        Activity activity = this.cordova.getActivity();
        activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_SECURE);
        super.onPause(multitasking);
    }

    @Override
    public void onResume(boolean multitasking) {
        super.onResume(multitasking);
        Activity activity = this.cordova.getActivity();
        activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
    }

}
