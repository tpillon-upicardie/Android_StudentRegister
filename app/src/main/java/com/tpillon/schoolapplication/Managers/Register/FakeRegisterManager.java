package com.tpillon.schoolapplication.Managers.Register;

import com.tpillon.schoolapplication.Models.Student;

public class FakeRegisterManager implements IRegisterManager {

    /**
     * just sleep 2 seconds to simulate long process
     */
    public void save(Student student){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO
            e.printStackTrace();
        }
    }
}
