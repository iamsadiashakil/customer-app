package com.pie.trainingtask.customerapp.controller;

import com.pie.trainingtask.customerapp.dto.Customer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Request header for produces: Accept:application/json
//Request header for consumes: Content-Type:application/json
@RequestMapping("/api/v1/customer-service")
public interface CustomerApi {

    @GetMapping(path = "/customers", produces = {MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE})
    List<Customer> getAllCustomers();

    @GetMapping(path = "/customers/{id}"/*, produces = {MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE}*/)
    Customer getCustomer(@PathVariable Long id);

    @PostMapping(path = "/customers", consumes = {MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE})
    Customer createCustomer(@RequestBody Customer customerDetail);

    @PutMapping(path = "/customers/{id}",
            consumes = {MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE})
    Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customerDetail);

    @DeleteMapping(path = "/customers/{id}", produces = {MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE})
    void deleteCustomer(@PathVariable Long id);

}
