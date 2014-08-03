package com.banana.sefue.Utils;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by EDC on 03/08/14.
 */
public class ToastMessage {

    public static void sendMessage(String message, Activity activity) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();
    }
}
