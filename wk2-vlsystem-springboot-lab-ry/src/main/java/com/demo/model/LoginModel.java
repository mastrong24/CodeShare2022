package com.demo.model;

import java.sql.Time;

public class LoginModel {

    private int lo_id;
    private EmployeeModel employeeModel;
    private String lo_password;
    private Time lo_time;

    public LoginModel (int lo_id,EmployeeModel employeeModel, String lo_password, Time lo_time){
        this.lo_id=lo_id;
        this.employeeModel=employeeModel;
        this.lo_password=lo_password;
        this.lo_time=lo_time;
    }


    public int getLo_id() {
        return lo_id;
    }

    public void setLo_id(int lo_id) {
        this.lo_id = lo_id;
    }

    public EmployeeModel getEmployeeModel() {
        return employeeModel;
    }

    public void setEmployeeModel(EmployeeModel employeeModel) {
        this.employeeModel = employeeModel;
    }

    public String getLo_password() {
        return lo_password;
    }

    public void setLo_password(String lo_password) {
        this.lo_password = lo_password;
    }

    public Time getLo_time() {
        return lo_time;
    }

    public void setLo_time(Time lo_time) {
        this.lo_time = lo_time;
    }


}
