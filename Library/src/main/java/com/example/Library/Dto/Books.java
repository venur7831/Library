package com.example.Library.Dto;

import io.swagger.models.auth.In;

import java.io.Serializable;

public class Books implements Serializable {
    private Integer id;
    private String name;
    private String writer;
    private String summary;
    private String categor;


    public Books(Integer id, String name, String writer, String summary, String category) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.summary = summary;
        this.categor = category;
    }


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
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCategory() {
        return categor;
    }


    public void setCategory(String category) {

        this.categor = category;
    }

    public Books() {
    }
}


