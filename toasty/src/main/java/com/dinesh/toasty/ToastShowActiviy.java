package com.dinesh.toasty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ToastShowActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_show_activiy);
        Toast.makeText(this, "Toast by Demo library activity", Toast.LENGTH_SHORT).show();

    }
    public static void launch(Context context) {
        Intent starter = new Intent(context, ToastShowActiviy.class);
        starter.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(starter);
    }
}