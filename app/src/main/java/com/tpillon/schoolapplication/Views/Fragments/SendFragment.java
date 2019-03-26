package com.tpillon.schoolapplication.Views.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.tpillon.schoolapplication.Managers.ProcessBar.ProgressBarManager;
import com.tpillon.schoolapplication.Managers.SendService.ISendServiceManager;
import com.tpillon.schoolapplication.Managers.SendService.SendServiceManager;
import com.tpillon.schoolapplication.Models.Student;
import com.tpillon.schoolapplication.R;

public class SendFragment extends Fragment {

    /**
     * manager to update progress bar
     */
    private ProgressBarManager _progressBarManager;

    /**
     * manager to store student
     */
    private ISendServiceManager _sendManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.send_fragment, container, false);

        ProgressBar bar=view.findViewById(R.id.progessBar);

        _progressBarManager = new ProgressBarManager(bar);
        _sendManager = new SendServiceManager(_progressBarManager, getContext());

        return  view;
    }

    /**
     * store student
     */
    public void send(Student student) {
        _sendManager.store(student);
    }
}
