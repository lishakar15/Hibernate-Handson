package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Teacher {
    private int id;
    private String name;
    private String country;

    public int getId() {
        return id;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
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

    public Teacher(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

}
