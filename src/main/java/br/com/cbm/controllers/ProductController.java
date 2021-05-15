package br.com.cbm.controllers;

import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    public ResponseEntity getAllproduct(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity getIdProduct(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity insertProduct(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity updateProductId(){
        return  ResponseEntity.ok().build();
    }

    public ResponseEntity updateProductDetails(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity updateProductStatus(){
        return ResponseEntity.ok().build();
    }

    public ResponseEntity deleteProductId(){
        return ResponseEntity.ok().build();
    }
}
