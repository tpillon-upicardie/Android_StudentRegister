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
public class SendAsyncTask extends AsyncTask<Student,Integer,Student[]> {

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
    private final Context _context;

    public SendAsyncTask(IProgressBarManager progressBarManager, Context context){
        _context = context;
        _progressBarManager = progressBarManager;

        _notificationsManager = new NotifManager(context);
        _registerManager = new FakeRegisterManager();
    }

    /**
     * save the student in background
     * register student
     * update value in progressBar
     * @param students : students to register
     */
    @Override
    protected Student[] doInBackground(@NonNull Student... students) {

        // apply foreach student
        for (Student stud: students) {
            _registerManager.save(stud);
            publishProgress(100);
        }
        return students;
    }

    /**
     * during progress update : update progress value
     * apply by UI thread
     * @param values : first value will be put in progress bar
     */
    @Override
    protected void onProgressUpdate(Integer... values) {
        if(values.length <1)
            throw new IllegalArgumentException("argument must have one value");

        _progressBarManager.setValue(values[0]);
    }

    /**
     * prepare to apply process
     * apply by UI thread
     * apply before background process
     *
     * change value in ProgressBar to 1
     * show ProgressBar
     */
    @Override
    protected void onPreExecute() {
        _progressBarManager.setValue(1);
        _progressBarManager.showBar();
    }

    /**
     * send notification after background process
     *
     * apply by UI thread
     * apply after background process
     */
    @Override
    protected void onPostExecute(Student[] students) {

        Resources resources = _context.getResources();
        String title = resources.getString(R.string.StudentIsRegistered);

        // apply foreach student
        for (Student stud: students) {
            String message = stud.getName() + " is registered";
            _notificationsManager.sendNotification(title, message, R.drawable.rocket);
        }
    }
}
