/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.in28minutes.rest.webservices.restfulwebservices.versioning;

/**
 *
 * @author earlharris
 */
public class PersonV1 {
    
    private String name;

    public PersonV1(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PersonV1{" + "name=" + name + '}';
    }
    
    
}
