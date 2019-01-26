package com.tpillon.schoolapplication.Managers.SendService;

import com.tpillon.schoolapplication.Managers.Notifications.*;
import com.tpillon.schoolapplication.Managers.Save.*;
import com.tpillon.schoolapplication.Managers.ProcessBar.*;

public class SendServiceManager implements ISendServiceManager {

    private final INotificationsManager _notificationsManager;
    private final ISaveManager _saveManager;
    private final IProcessBarManager _processBarManager;
    private final SendAsyncTask _sendAsyncTask;

    public SendServiceManager(IProcessBarManager processBarManager){
        _processBarManager = processBarManager;

        _notificationsManager = new NotificationsManager();
        _saveManager = new SaveManager();
        _sendAsyncTask = new SendAsyncTask();
    }

}
