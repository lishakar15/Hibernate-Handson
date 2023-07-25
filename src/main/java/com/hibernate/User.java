package com.hibernate;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;
@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String name;
    private String country;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @NotNull
    private List<UserVehicle> userVehicleList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<UserVehicle> getVehicleList() {
        return userVehicleList;
    }

    public void setVehicleList(List<UserVehicle> userVehicleList) {
        this.userVehicleList = userVehicleList;
    }

    public User() {
    }
}
