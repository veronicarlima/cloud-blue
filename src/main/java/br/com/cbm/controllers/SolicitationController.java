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
//
//    @GetMapping
//    public ResponseEntity getSolicitations(){
//        return ResponseEntity.accepted().build();
//    }
//
//    @PostMapping
//    public ResponseEntity insertSolicitations(){
//        return ResponseEntity.accepted().build();
//    }
//
//    @PutMapping
//    public ResponseEntity approveSolicitations(){
//        return ResponseEntity.accepted().build();
//    }
//
//    @DeleteMapping
//    public ResponseEntity cancelSolicitations(){
//        return ResponseEntity.accepted().build();
//    }
//
//    @PutMapping
//    public ResponseEntity getApprovalsSolicitations(){
//        return ResponseEntity.accepted().build();
//    }
}

