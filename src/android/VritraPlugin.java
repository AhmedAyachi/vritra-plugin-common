package com.vritra.common;

import org.apache.cordova.*;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;


public class VritraPlugin extends CordovaPlugin {

    static public Context context;
    static public Resources resources;
    static public String packageName;

    @Override
    public void initialize(CordovaInterface cordova,CordovaWebView webview){
        VritraPlugin.context=cordova.getContext();
        VritraPlugin.resources=VritraPlugin.context.getResources();
        VritraPlugin.packageName=VritraPlugin.context.getPackageName();
    }

    static public int getResourceId(String type,String name){
        return resources.getIdentifier(name,type,VritraPlugin.packageName);
    }

    static public int getColor(String name){
        switch(name){
            case "brown": return Color.parseColor("#964B00");
            case "orange": return Color.parseColor("#FFA500");
            case "transparent": return Color.TRANSPARENT;
            default: return Color.parseColor(name);
        }
    }
}
