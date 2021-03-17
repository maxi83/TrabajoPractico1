package com.example.trabajopractico1;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class DetectarUsb extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean conect= intent.getAction().equals(Intent.ACTION_POWER_CONNECTED);
        if (conect){
            Toast.makeText(context,"Iniciando llamada al 2664676856.", Toast.LENGTH_LONG).show();
        Intent i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel: +54 2664616856"));
        context.startActivity(i);
       }
    }
}
