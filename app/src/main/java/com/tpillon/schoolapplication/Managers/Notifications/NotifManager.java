package com.tpillon.schoolapplication.Managers.Notifications;

import android.support.v4.app.NotificationCompat;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.v4.app.NotificationCompat;

import com.tpillon.schoolapplication.R;

import java.util.Random;

public class NotifManager implements INotifManager {

    /**
     * default id of the notification Channel
     */
    private static final String DEFAULT_CHANNEL_ID = "ChannelId";

    /**
     * channel id used by the manager
     */
    private final String _channelId;

    /**
     * random to create id of notification
     */
    private final Random _idRandom;

    /**
     * context to notify message
     */
    private final Context _context;

    /**
     * constructor to create manager with default channel ID
     * @param context : context to notify message
     */
    public NotifManager(Context context) {
        this(context, DEFAULT_CHANNEL_ID);
    }

    /**
     * constructor to create manager
     * @param context : context to notify message
     * @param channelId : channel id used by the manager
     */
    public NotifManager(Context context, String channelId){
        _channelId = channelId;
        _context = context;
        _idRandom = new Random();

       createChannel();
    }

    /**
     * if sdk version upper than API 26+
     * create notification channel
     *
     * SOURCE : https://developer.android.com/training/notify-user/group
     */
    private void createChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O)
        return;

        CharSequence name =_context.getString(R.string.chanelName);
        int importance = NotificationManager.IMPORTANCE_DEFAULT;
        NotificationChannel channel = new NotificationChannel(_channelId, name, importance);

        // Register the channel with the system; you can't change the importance
        // or other notification behaviors after this
        NotificationManager notificationManager = _context.getSystemService(NotificationManager.class);
        notificationManager.createNotificationChannel(channel);
    }

    /**
     * store notification with text
     * create notification with title text and icon
     * collect notification manager and store notification
     * @return : index of the notification
     * SOURCE : https://developer.android.com/training/notify-user/build-notification
     */
    @Override
    public int sendNotification(String title, String text, int iconId) {

        NotificationCompat.Builder builder = new NotificationCompat.Builder(_context, _channelId)
                .setSmallIcon(iconId)
                .setContentTitle(title)
                .setContentText(text);

        // Gets an instance of the NotificationManager service
        NotificationManager notificationManager = (NotificationManager) _context.getSystemService(Context.NOTIFICATION_SERVICE);
        int id = _idRandom.nextInt();
        notificationManager.notify(id, builder.build());
        return id;
    }

    /**
     * store notification with string res id
     * collect value in resources
     */
    @Override
    public int sendNotification(int titleRes, int textRes, int iconId) {
        Resources resources=_context.getResources();
        String title = resources.getString(titleRes);
        String text= resources.getString(textRes);

        return sendNotification(title, text, iconId);
    }
}
