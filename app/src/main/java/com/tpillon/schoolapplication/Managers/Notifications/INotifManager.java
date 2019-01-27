package com.tpillon.schoolapplication.Managers.Notifications;

/**
 * manager to store notifications
 */
public interface INotifManager {
    /**
     * store notification
     * @return : id to the notification
     */
    int sendNotification(String title, String text, int iconId);

    /**
     * store notification
     * @param titleRes : id of the string resource for title
     * @param textRes : id of the string resource for text
     * @return : id to the notification
     */
    int sendNotification(int titleRes, int textRes, int iconId);
}
