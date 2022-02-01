package com.pie.trainingtask.customerapp.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    private int id;
    private String name;
    private String description;
    private int quantity;
    private long price;
}
