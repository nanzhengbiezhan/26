package com.clutch.student.Entity;

/**
 * 登录信息类
 */

public class User {
    private int student_id;
    private String password;
    public User(){

    }
    public User(int student_id, String password){
        this.student_id = student_id;
        this.password = password;
    }
    public int getId(){return  student_id;}
    public void setStudent_id(int id){student_id=id;}
    public String getPassword(){return password;}
    public void setPassword(String password){this.password=password;}
}
