package com.firebase.geochat.FirebaseService;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

import java.util.List;

/**
 * Created by Chris on 2014-12-29.
 */
public class DataSort<T> extends Activity{

    private static final String TAG = "BroadcastTest";
    private Intent intent;
    List<T> data;

    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            update(intent);
        }
    };

    @Override
    public void onResume() {
        super.onResume();
        startService(intent);
        registerReceiver(broadcastReceiver, new IntentFilter(FirebaseServiceController.BROADCAST_ACTION));
    }

    @Override
    public void onPause() {
        super.onPause();
        unregisterReceiver(broadcastReceiver);
        stopService(intent);
    }

    private void update(Intent intent) {
        data = (List<T>) intent.getSerializableExtra("mModels");
        Log.d(TAG, "mModels");
    }
}
