package com.kgfsl.springbootconfig.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String name;
    private String city;
    public Employee() {
    }
    public Employee(final Integer id, final String name, final String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    // @Override
    // public String toString() {
    //     return id + name + city;
    // }
}