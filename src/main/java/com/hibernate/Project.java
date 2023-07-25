package com.hibernate;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "project_details")
public class Project {
    @Id
    private int id;
    private String name;
    private String location;
    @ManyToMany
    private List<Employee> employee;

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Project() {
    }
}
