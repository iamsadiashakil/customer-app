package com.pie.trainingtask.customerapp.service;

import com.pie.trainingtask.customerapp.dto.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer getCustomer(Long id);

    Customer saveCustomer(Customer customer);

    Customer updateCustomer(Long id, Customer customerDetail);

    void deleteCustomer(Long id);
}
