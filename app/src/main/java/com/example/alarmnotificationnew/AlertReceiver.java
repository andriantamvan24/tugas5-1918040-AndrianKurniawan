package com.example.alarmnotificationnew;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

class AlarmReceiver extends BroadcastReceiver {
    MediaPlayer player;

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationHelper notificationHelper = new
                NotificationHelper(context);
        NotificationCompat.Builder nb =
                notificationHelper.getChannelNotification();
        notificationHelper.getManager().notify(1, nb.build());
//        // TODO Auto-generated method stub
//        Toast.makeText(context, "Alarm aktif!", Toast.LENGTH_LONG).show();
//        player = MediaPlayer.create(context, R.raw.azan);
//        player.start();
    }
}
