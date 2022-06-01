package com.dinesh.toasty;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void showToast(Context context, String msg){
        Toast.makeText(context, msg+"1.0.2", Toast.LENGTH_SHORT).show();
    }
}
