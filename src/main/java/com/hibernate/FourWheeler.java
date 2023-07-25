package com.hibernate;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle{
    private String steeringWheel;

    public FourWheeler() {
    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public FourWheeler(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public FourWheeler(int id, String name, String registerNumber, String steeringWheel) {
        super(id, name, registerNumber);
        this.steeringWheel = steeringWheel;
    }

    @Override
    public String toString() {
        return "FourWheeler{" +
                "steeringWheel='" + steeringWheel + '\'' +
                '}';
    }
}
