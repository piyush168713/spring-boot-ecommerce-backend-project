package com.luv2code.ecommerce.dto;

import lombok.Data;

// Use this class to send back a Java Object as JSON
@Data
public class PurchaseResponse {

    private final String orderTrackingNumber;
}
