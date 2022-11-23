package com.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name="AUTHOR")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int au_id;
    private String au_name;


    @ManyToMany(fetch = FetchType.EAGER,mappedBy="author",cascade = CascadeType.ALL)
    private List<CourseEntity> courseEntity;


    @OneToOne(fetch = FetchType.EAGER,mappedBy="author",cascade = CascadeType.ALL)
    private LoginEntity loginEntity;


    public AuthorEntity(int au_id, String au_name, List<CourseEntity> courseEntity,LoginEntity loginEntity){
        this.au_id=au_id;
        this.au_name=au_name;
        this.courseEntity=courseEntity;
        this.loginEntity=loginEntity;
    }

    public AuthorEntity() {

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

    public List<CourseEntity> getCourseEntity() {
        return courseEntity;
    }


    public void setCourseEntity(List<CourseEntity> courseEntity) {
        this.courseEntity = courseEntity;
    }

    public LoginEntity getLoginEntity() {
        return loginEntity;
    }

    public void setLoginEntity(LoginEntity loginEntity) {
        this.loginEntity = loginEntity;
    }


}
