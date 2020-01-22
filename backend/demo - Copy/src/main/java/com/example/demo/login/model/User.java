package com.example.demo.login.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
public class User {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;


}
