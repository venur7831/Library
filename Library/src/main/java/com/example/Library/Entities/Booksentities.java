package com.example.Library.Entities;



import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="BOOKS_ENTITITES")

public class Booksentities {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id", nullable=false)
    @NotNull
    private Integer id;
    @NotBlank
    private String name;
    private String writer;
    private String summary;
    private String category;




    public Booksentities(@NotNull Integer id, @NotBlank(message = "student name cannot be empty") String name, String writer, String summary, String category) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.summary = summary;
        this.category = category;
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
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Booksentities() {
    }
}
