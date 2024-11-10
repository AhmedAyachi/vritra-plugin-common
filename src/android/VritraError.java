package com.vritra.common;

import org.json.JSONObject;


public class VritraError extends JSONObject {

    public VritraError(){
        this("no message");
    }

    public VritraError(Exception exception){
        this(exception.getMessage());
    }

    public VritraError(String message){
        try{
            this.putOpt("message",message);
        }
        catch(Exception exception){}
    }

    public void set(String key,Object value){
        try{
            this.put(key,value);
        }
        catch(Exception exception){}
    };
}
