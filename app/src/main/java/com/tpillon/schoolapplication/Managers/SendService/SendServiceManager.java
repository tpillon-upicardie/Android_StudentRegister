package com.tpillon.schoolapplication.Managers.SendService;

import android.content.Context;

import com.tpillon.schoolapplication.Managers.ProcessBar.*;
import com.tpillon.schoolapplication.Models.Student;

public class SendServiceManager implements ISendServiceManager {


    private final IProgressBarManager _processBarManager;
    private final Context _context;

    public SendServiceManager(IProgressBarManager processBarManager, Context context){
        _context=context;
        _processBarManager=processBarManager;
    }

    public void store(Student student){
        SendAsyncTask sendAsyncTask= new SendAsyncTask(_processBarManager, _context);
        sendAsyncTask.execute(student);
    }

}
