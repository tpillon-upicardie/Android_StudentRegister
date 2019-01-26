package com.tpillon.schoolapplication.Views.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tpillon.schoolapplication.Managers.DataCollect.DataCollectManager;
import com.tpillon.schoolapplication.Managers.DataCollect.IDataCollectManager;
import com.tpillon.schoolapplication.R;

public class FormFragment extends Fragment {

    /**
     * manager to collect data in view
     */
    private final IDataCollectManager _dataCollectManager;

    public FormFragment(){
        _dataCollectManager = new DataCollectManager();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //define layout associated
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.form_fragment, container, false);
    }
}
