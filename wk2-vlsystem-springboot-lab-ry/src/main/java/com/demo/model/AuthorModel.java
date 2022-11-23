package com.demo.model;

import java.util.List;

public class AuthorModel {

    private int au_id;
    private String au_name;



    private List<CourseModel> courseModel;

    public AuthorModel(int au_id, String au_name, List<CourseModel> courseModel){
        this.au_id=au_id;
        this.au_name=au_name;
        this.courseModel=courseModel;
    }



    public int getAu_id() {
        return au_id;
    }

    public void setAu_id(int au_id) {
        this.au_id = au_id;
    }

    public String getAu_name() {
        return au_name;
    }

    public void setAu_name(String au_name) {
        this.au_name = au_name;
    }

    public List<CourseModel> getCourseModel() {
        return courseModel;
    }

    public void setCourseModel(List<CourseModel> courseModel) {
        this.courseModel = courseModel;
    }


}
