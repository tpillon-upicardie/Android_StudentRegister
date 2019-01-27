package com.tpillon.schoolapplication.Managers.SendService;

import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.tpillon.schoolapplication.Managers.Notifications.INotifManager;
import com.tpillon.schoolapplication.Managers.Notifications.NotifManager;
import com.tpillon.schoolapplication.Managers.ProcessBar.IProgressBarManager;
import com.tpillon.schoolapplication.Managers.Register.IRegisterManager;
import com.tpillon.schoolapplication.Managers.Register.FakeRegisterManager;
import com.tpillon.schoolapplication.Models.Student;
import com.tpillon.schoolapplication.R;

/**
 * async task to send the student in background
 * SOURCE : https://developer.android.com/reference/android/os/AsyncTask
 * SOURCE : https://stackoverflow.com/questions/9671546/asynctask-android-example
 */
public class SendAsyncTask extends AsyncTask<Void,Void, Void> {

    /**
     * manager to send notification
     */
    private final INotifManager _notificationsManager;

    /**
     * manager to register student
     */
    private final IRegisterManager _registerManager;

    /**
     * manager to update progressBar
     */
    private final IProgressBarManager _progressBarManager;
    public SendAsyncTask(IProgressBarManager progressBarManager){
        _progressBarManager = progressBarManager;

        _notificationsManager = new NotifManager();
        _registerManager = new FakeRegisterManager();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        return null;
    }
}