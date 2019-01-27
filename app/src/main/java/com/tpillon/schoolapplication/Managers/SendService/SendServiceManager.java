package com.tpillon.schoolapplication.Managers.SendService;

import com.tpillon.schoolapplication.Managers.ProcessBar.*;

public class SendServiceManager implements ISendServiceManager {
    private final IProgressBarManager _progressBarManager;

    public SendServiceManager(IProgressBarManager progressBarManager) {
        _progressBarManager=progressBarManager;
    }
}
