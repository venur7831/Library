package com.example.Library.Entities;

import io.swagger.models.auth.In;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="HISTORY_ENTITITES")

public class Historyentities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name="id", nullable=false)

    @NotNull
    private Integer userid;
    private Integer bookid;
    @NotBlank(message = "id  cannot be empty")
    private String startdate;
    private String enddate;


    public Historyentities(@NotNull Integer userid, Integer bookid, String startdate, String enddate) {
        this.userid = userid;
        this.bookid = bookid;
        this.startdate = startdate;
        this.enddate = enddate;
    }

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

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public Historyentities() {
    }
}
