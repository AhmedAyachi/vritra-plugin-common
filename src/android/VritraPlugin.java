package com.vritra.common;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;


public class VritraPlugin extends CordovaPlugin {

    static protected Context context;
    static protected Resources resources;
    static protected String packagename;

    @Override
    public void initialize(CordovaInterface cordova,CordovaWebView webview){
        VritraPlugin.context=cordova.getContext();
        VritraPlugin.resources=VritraPlugin.context.getResources();
        VritraPlugin.packagename=VritraPlugin.context.getPackageName();
    }

    static protected int getResourceId(String type,String name){
        return resources.getIdentifier(name,type,VritraPlugin.packagename);
    }

    static protected int getColor(String name){
        switch(name){
            case "brown": return Color.parseColor("#964B00");
            case "orange": return Color.parseColor("#FFA500");
            case "transparent": return Color.TRANSPARENT;
            default: return Color.parseColor(name);
        }
    }
    
}