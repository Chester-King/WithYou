package com.example.withyou;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BatteryLevelReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "BAttery's dying!!", Toast.LENGTH_LONG).show();
        Log.v("FoZRe", "BATTERY LOW!!");

    }


}