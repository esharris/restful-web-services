/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

/**
 *
 * @author earlharris
 */
public class HelloWorldBean {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public HelloWorldBean(String message) {
       this.message = message; 
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" + "message=" + message + '}';
    }
    
    
}
