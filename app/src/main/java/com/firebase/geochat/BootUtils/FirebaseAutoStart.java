package com.firebase.geochat.BootUtils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.firebase.geochat.FirebaseService.FirebaseBackgroundService;
import com.firebase.geochat.FirebaseService.FirebaseServiceController;

/**
 * Created by Chris on 2014-12-28.
 */
public class FirebaseAutoStart extends BroadcastReceiver {
    FirebaseBackgroundService firebaseBackgroundService = new FirebaseBackgroundService();
    public void onReceive(Context context, Intent intent)
    {
        Log.i("Autostart", "**********started************");
        Toast.makeText(context, "Started Boot Class", Toast.LENGTH_SHORT).show();
        Intent i= new Intent(context, FirebaseServiceController.class);
        //for auto-start
        //context.startService(i);
    }
}
