package br.com.cbm.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/solicitations")
public class SolicitationController {

    @GetMapping
    public ResponseEntity getAllSolicitations(){
        return ResponseEntity.accepted().build();
    }
 
     @GetMapping("/id")
     public ResponseEntity getIdSolicitations(){
         return ResponseEntity.accepted().build();
     }
 
     @PostMapping
     public ResponseEntity insertSolicitations(){
         return ResponseEntity.accepted().build();
     }

     @PostMapping("/id")
     public ResponseEntity insertDetailSolicitations(){
         return ResponseEntity.accepted().build();
     }

    @PutMapping("/id")
    public ResponseEntity approveSolicitations(){
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping("/id")
    public ResponseEntity cancelSolicitations(){
        return ResponseEntity.accepted().build();
    }

}

