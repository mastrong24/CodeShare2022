package com.demo.entity;

import javax.persistence.*;
import java.sql.Time;

@Entity(name="Login_Credential")
public class LoginEntity {

    @Id
    private int lo_id;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "AU_ID")
    private EmployeeEntity employeeEntity;
    private String lo_password;
    private Time lo_time;

    public LoginEntity (int lo_id,EmployeeEntity employeeEntity, String lo_password, Time lo_time){
        this.lo_id=lo_id;
        this.employeeEntity=employeeEntity;
        this.lo_password=lo_password;
        this.lo_time=lo_time;
    }

    public LoginEntity() {

    }


    public int getLo_id() {
        return lo_id;
    }

    public void setLo_id(int lo_id) {
        this.lo_id = lo_id;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeModel) {
        this.employeeEntity = employeeModel;
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
