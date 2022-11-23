package com.demo.model;

import javax.persistence.criteria.CriteriaBuilder;

public class CourseModel {

    private int co_id;
    private AuthorModel authorModel;

    private String co_name;

    CourseModel(int co_id, AuthorModel authorModel, String co_name){
        this.co_id=co_id;
        this.co_name=co_name;
        this.authorModel=authorModel;
    }


    public int getCo_id() {
        return co_id;
    }

    public void setCo_id(int co_id) {
        this.co_id = co_id;
    }

    public AuthorModel getAuthorModel() {
        return authorModel;
    }

    public void setAuthorModel(AuthorModel authorModel) {
        this.authorModel = authorModel;
    }

    public String getCo_name() {
        return co_name;
    }

    public void setCo_name(String co_name) {
        this.co_name = co_name;
    }




}
