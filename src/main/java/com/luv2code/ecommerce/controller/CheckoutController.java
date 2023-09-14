package com.luv2code.ecommerce.controller;

import com.luv2code.ecommerce.service.CheckoutService;
import com.luv2code.ecommerce.dto.Purchase;
import com.luv2code.ecommerce.dto.PurchaseResponse;
import org.springframework.web.bind.annotation.*;

// @CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    /**
     * metheod checkoutService defined
     */
    public CheckoutService checkoutService;

    // constructor injection
    public CheckoutController(CheckoutService checkoutService){
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){

        // delegate this to my service
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return purchaseResponse;

    }

}
