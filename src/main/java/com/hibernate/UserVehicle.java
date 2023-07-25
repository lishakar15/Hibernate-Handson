package com.hibernate;

import javax.persistence.*;

@Entity
public class UserVehicle {
    @Id
    @GeneratedValue
    private int id;
    private String vehicleName;
    private String vehicleType;
    @ManyToOne
    @JoinColumn(name = "uId")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public UserVehicle() {
    }
}
