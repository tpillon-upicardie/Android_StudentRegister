package com.tpillon.schoolapplication.Managers.SendService;

import com.tpillon.schoolapplication.Models.Student;

/**
 * manager to start service to store student in store
 */
public interface ISendServiceManager {
    /**
     * start new service to store the student
     */
    void store(Student student);
}
