package com.pie.trainingtask.customerapp.controller;

import com.pie.trainingtask.customerapp.dto.Customer;
import com.pie.trainingtask.customerapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController implements CustomerApi {

    @Autowired
    CustomerService customerService;

    @Override
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @Override
    public Customer getCustomer(Long id) {
        return customerService.getCustomer(id);
    }

    @Override
    public Customer createCustomer(Customer customerDetail) {
        return customerService.saveCustomer(customerDetail);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customerDetail) {
        return customerService.updateCustomer(id, customerDetail);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerService.deleteCustomer(id);
    }
}
