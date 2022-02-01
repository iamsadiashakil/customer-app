package com.pie.trainingtask.customerapp.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Customer {
    private Long id;

    private String name;

    private Long age;

    private String mobile;

    private List<Address> addresses;

    private List<Product> products;
}
