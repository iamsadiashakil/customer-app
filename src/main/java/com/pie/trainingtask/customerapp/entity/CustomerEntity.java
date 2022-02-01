package com.pie.trainingtask.customerapp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
@Getter
@Setter
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Long age;

    private String mobile;

    @OneToMany(mappedBy = "customerEntity", cascade = CascadeType.ALL)
    private List<AddressEntity> addresses;

    @OneToMany(mappedBy = "customerEntity", cascade = CascadeType.ALL)
    private List<ProductEntity> products;
}
