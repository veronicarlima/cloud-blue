package br.com.cbm.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

    public ResponseEntity getAllClients(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity getIdClient(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity insertClient(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity updateClientId(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity updateDetailsClient(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity deleteClient(){
        return ResponseEntity.ok().build();
    }
}
