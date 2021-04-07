package com.gitee.edu.info.manager.domain;

public class Student {
    private String id;
    private String name;
    private String age;
    private String birthday;

    public Student(){

    }

    public Student(String id,String name,String age,String birthday){
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public String getAge(){
        return age;
    }

    public void setBirthday(String birthday){
        this.birthday = birthday;
    }

    public String getBirthday(){
        return birthday;
    }
}
