package com.hibernate;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {
    private String steeringHandle;

    public TwoWheeler() {
        super();
    }

    public TwoWheeler(String steeringHandle) {
        this.steeringHandle = steeringHandle;
    }

    public TwoWheeler(int id, String name, String registerNumber, String steeringHandle) {
        super(id, name, registerNumber);
        this.steeringHandle = steeringHandle;
    }

    public String getSteeringHandle() {
        return steeringHandle;
    }

    public void setSteeringHandle(String steeringHandle) {
        this.steeringHandle = steeringHandle;
    }

    @Override
    public String toString() {
        return "TwoWheeler{" +
                "steeringHandle='" + steeringHandle + '\'' +
                '}';
    }
}
