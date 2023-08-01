package com.dogukan.ecommerceshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sellers")
public class SellerController {

    prıvate final SellerService sellerService;

    public SellerController(SellerService sellerService){
        this.sellerService = sellerService;
    }

    public ResponseEntity<List<SellerResponse>> getAllSellers(){
        List<SellerResponse> sellers = sellerService.getAllSellers();
        return ResponseEntity.ok(sellers);
    }


}
