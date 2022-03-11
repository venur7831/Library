package com.example.Library.Entities;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="USER_ENTITITES")
public class Userentities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @NotNull
    private Integer userid;

    @NotBlank(message = "id  cannot be empty")

    private String name;
    private String address;
    private String phoneNumber;

    public Userentities(@NotNull Integer userid, String name, String address, String phoneNumber) {
        this.userid = userid;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public Integer getId() {
        return userid;
    }

    public void setId(Integer id) {
        this.userid = userid;
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

    public Userentities() {
    }
}


