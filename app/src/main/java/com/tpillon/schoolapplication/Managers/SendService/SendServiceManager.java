package com.tpillon.schoolapplication.Managers.SendService;

import com.tpillon.schoolapplication.Managers.ProcessBar.*;

public class SendServiceManager implements ISendServiceManager {

    private final IProgressBarManager _processBarManager;

    public SendServiceManager(IProgressBarManager processBarManager) {
        _processBarManager=processBarManager;
    }
}
