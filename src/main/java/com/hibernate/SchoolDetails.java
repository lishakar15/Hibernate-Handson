package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SchoolDetails {
    private String schoolName;
    @Column(name= "school_address")
    private String schoolAddress;
    private int pinCode;


    public SchoolDetails() {
    }

    public SchoolDetails(String schoolName, String schoolAddress, int pinCode) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.pinCode = pinCode;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }


    @Override
    public String toString() {
        return "SchoolDetails{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
