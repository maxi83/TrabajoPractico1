package com.example.trabajopractico1;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class DetectarUSB extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getExtras().getBoolean("connected"))

            Toast.makeText(context,"Se ha conectado/desconectado el USB. llamando al 4445397.", Toast.LENGTH_LONG).show();
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:" + "4445397"));
        context.startActivity(i);
    }
}
