package com.tpillon.schoolapplication.Models;

public class Student {

    private String _name;
    private String _email;
    private String _postal;
    private String _pwd;
    private String _phone;

    public String getName() {
        return _name;
    }
    public void setName(String name) { _name = name; }

    public String getEmail() { return _email; }
    public void setEmail(String email) { this._email = email; }

    public String getPostal() { return _postal; }
    public void setPostal(String postal) { _postal = postal; }

    public String getPwd() { return _pwd; }
    public void setPwd(String pwd) { this._pwd = pwd; }

    public String getPhone() { return _phone; }
    public void setPhone(String phone) { this._phone = phone; }
}
