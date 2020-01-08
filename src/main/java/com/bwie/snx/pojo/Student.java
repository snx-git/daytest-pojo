package com.bwie.snx.pojo;

import java.io.Serializable;

public class Student implements Serializable{
    private Integer id;

    private String name;

    private Integer age;

    private String pwd;

    private String techang;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getTechang() {
        return techang;
    }

    public void setTechang(String techang) {
        this.techang = techang == null ? null : techang.trim();
    }
}