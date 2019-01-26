package com.tpillon.schoolapplication.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tpillon.schoolapplication.Managers.DataCollect.*;
import com.tpillon.schoolapplication.Managers.ProcessBar.IProcessBarManager;
import com.tpillon.schoolapplication.Managers.ProcessBar.ProcessBarManager;
import com.tpillon.schoolapplication.Managers.SendService.*;
import com.tpillon.schoolapplication.R;

public class MainActivity extends AppCompatActivity {

    private final IProcessBarManager _processBarManager;
    private final IDataCollectManager _dataManager;
    private final ISendServiceManager _sendManager;

    public MainActivity(){
        _processBarManager = new ProcessBarManager();
        _dataManager = new DataCollectManager();
        _sendManager = new SendServiceManager(_processBarManager);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
