package com.mybatis.demo.model;

import com.sun.org.apache.xpath.internal.objects.XString;

public class User {
    public int id;
    public String email;
    public String textProp;
    public String nickName;
    public String passWord;
    public String regTime;
    public String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTextProp() {
        return textProp;
    }

    public void setTextProp(String textProp) {
        this.textProp = textProp;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
