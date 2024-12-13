package com.webservices.projeto.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.projeto.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Joao", "tantofaz@gmail.com", "123234234", "12232344");
        return ResponseEntity.ok().body(u);
    }
}
