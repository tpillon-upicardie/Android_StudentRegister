package com.tpillon.schoolapplication.Managers.DataCollect;

import android.app.Activity;
import android.view.View;

import com.tpillon.schoolapplication.Models.Student;

/**
 * manager to collect data about student
 */
public interface IDataCollectManager {
    /**
     * collect student information
     * @param view : view to collect information
     */
    Student collectData(View view);
}
