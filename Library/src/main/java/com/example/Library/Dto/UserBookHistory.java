package com.example.Library.Dto;

import java.io.Serializable;

public class UserBookHistory implements Serializable {
    public UserBookHistory(Integer userid, Integer bookid, String startdate, String enddate) {
        this.userid = userid;
        this.bookid = bookid;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    private Integer userid;
    private Integer bookid;
    private String startdate;
    private String enddate;



    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public UserBookHistory() {
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }
}


