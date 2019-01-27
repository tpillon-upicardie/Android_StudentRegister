package com.tpillon.schoolapplication.Managers.DataCollect;

import android.view.View;
import android.widget.EditText;

import com.tpillon.schoolapplication.Models.Student;
import com.tpillon.schoolapplication.R;

public class DataCollectManager implements IDataCollectManager {

    /**
     * populate student with view values
     * collect all values in view
     * create new student
     * set value in this instance and return it
     * @param view : where collect value
     */
    @Override
    public Student collectData(View view) {

        String name= getValue(view,R.id.nameText);
        String email = getValue(view,R.id.emailText);
        String postal = getValue(view,R.id.postalText);
        String pwd =getValue(view,R.id.pwdText);
        String phone = getValue(view,R.id.phoneText);

        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setPostal(postal);
        student.setPwd(pwd);
        student.setPhone(phone);

        return student;
    }

    /**
     * collect value in editText
     * get editText with same id in view
     * get text and return it
     * @param view : where get EditText
     * @param id : id of the component
     * @return : text inside the component
     */
    private String getValue(View view, int id) {
        EditText editText = view.findViewById(id);
        return editText.getText().toString();
    }
}
