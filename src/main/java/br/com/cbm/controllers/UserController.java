package br.com.cbm.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    public ResponseEntity getAllUsers(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity getIdUser(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity insertUser(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity updateUser(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity updateStatusUser(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity deleteUser(){
        return ResponseEntity.ok().build();
    }
}
