package com.firebase.geochat.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.firebase.geochat.FirebaseService.FirebaseServiceController;
import com.firebase.geochat.ServiceUtils.ServiceTools;
import com.firebase.geochat.R;

/**
 * Created by Chris on 2014-12-24.
 */
public class MainActivity extends Activity{


    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_main);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.window_title);

        intent = new Intent(this, FirebaseServiceController.class);

        if(!ServiceTools.isServiceRunning(FirebaseServiceController.class.getName(), MainActivity.this)){
            //for auto-start
            //this.startService(intent);
        }

        findViewById(R.id.btn_GeoChat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //switch activity
                switchToGeoChat();
            }
        });
    }

    public void switchToGeoChat(){
        Intent nextScreen = new Intent(getApplicationContext(), GeoActivity.class);
        // starting new activity
        startActivity(nextScreen);
    }

}
