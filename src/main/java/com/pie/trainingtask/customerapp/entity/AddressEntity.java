package com.pie.trainingtask.customerapp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Getter
@Setter
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String location;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customerEntity;
}
