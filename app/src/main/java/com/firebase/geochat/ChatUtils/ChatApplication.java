package com.firebase.geochat.ChatUtils;

import com.firebase.client.Firebase;

/**
 * Created by Chris on 2014-12-29.
 */
public class ChatApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
