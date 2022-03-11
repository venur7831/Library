package com.example.Library.Dto;

import java.io.Serializable;
import java.util.StringTokenizer;

public class User implements Serializable {

    private Integer userid;
    private String name;
    private String address;
    private String phoneNumber;

    public User(Integer userid, String name, String address, String phoneNumber) {
        this.userid = userid;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }

    public Integer getId() {
        return userid;
    }

    public void setId(Integer id) {
        this.userid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
