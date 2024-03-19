package com.neelam.storeappconsumereurekaribbon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer Id;
    private String name;
    private String brand;
    private double price;
}
