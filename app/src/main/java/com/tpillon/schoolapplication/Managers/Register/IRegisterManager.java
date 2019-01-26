package com.tpillon.schoolapplication.Managers.Register;

import com.tpillon.schoolapplication.Models.Student;

/**
 * manager to register student in store
 */
public interface IRegisterManager {
    /**
     * save the student in store
     * @param student : student to store
     */
    void save(Student student);
}
