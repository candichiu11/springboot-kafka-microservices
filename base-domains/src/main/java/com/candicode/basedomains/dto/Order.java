package com.candicode.basedomains.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String orderId;
    private String name;
    private int quantity;
    private double price;
}
