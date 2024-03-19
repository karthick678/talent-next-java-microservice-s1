package com.neelam.storeapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "product_details")
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer Id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_brand")
    private String brand;

    @Column(name = "product_price")
    private double price;
}
