package com.firebase.geochat.ServiceUtils;

import android.app.ActivityManager;


import android.app.Application;
import android.content.Context;

import java.util.List;

/**
 * Created by Chris on 2014-12-28.
 */
public class ServiceTools extends Application{
    private static String LOG_TAG = ServiceTools.class.getName();

    public static boolean isServiceRunning(String serviceClassName, Context context){
        final ActivityManager activityManager = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
        final List<ActivityManager.RunningServiceInfo> services = activityManager.getRunningServices(Integer.MAX_VALUE);

        for (ActivityManager.RunningServiceInfo runningServiceInfo : services) {
            if (runningServiceInfo.service.getClassName().equals(serviceClassName)){
                return true;
            }
        }
        return false;
    }
}
