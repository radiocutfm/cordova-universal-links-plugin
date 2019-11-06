package com.nordnetab.cordova.ul.referrer;

import android.os.Bundle;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.nordnetab.cordova.ul.referrer.Referrer;

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String rawReferrerString = intent.getStringExtra("referrer");

        if (rawReferrerString != null) {
            Referrer.data = rawReferrerString;
        } else {
	    	Referrer.data = "";
		}
    }
}
