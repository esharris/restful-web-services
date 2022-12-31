/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author earlharris
 */
@RestController
public class UserResource {
    
    private UserDaoService service;
    
    public UserResource(UserDaoService service) {
        this.service = service;
    }
    
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }
    
    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        service.save(user);
    }
}
