package com.demo.entity;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Entity(name = "COURSE")
public class CourseEntity{

    @Id
    private int co_id;
    @ManyToMany(cascade= CascadeType.ALL)
    @JoinColumn(name = "AU_ID")
    private List<AuthorEntity> authorEntity;

    private String co_name;

    CourseEntity(int co_id, List<AuthorEntity> authorEntity, String co_name){
        this.co_id=co_id;
        this.co_name=co_name;
        this.authorEntity=authorEntity;
    }

    public CourseEntity() {

    }


    public int getCo_id() {
        return co_id;
    }

    public void setCo_id(int co_id) {
        this.co_id = co_id;
    }

    public List<AuthorEntity> getAuthorEntity() {
        return authorEntity;
    }

    public void setAuthorEntity(List<AuthorEntity> authorEntity) {
        this.authorEntity = authorEntity;
    }

    public String getCo_name() {
        return co_name;
    }

    public void setCo_name(String co_name) {
        this.co_name = co_name;
    }




}
