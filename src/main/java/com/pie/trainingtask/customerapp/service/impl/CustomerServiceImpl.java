package com.pie.trainingtask.customerapp.service.impl;

import com.pie.trainingtask.customerapp.dto.Customer;
import com.pie.trainingtask.customerapp.entity.AddressEntity;
import com.pie.trainingtask.customerapp.entity.CustomerEntity;
import com.pie.trainingtask.customerapp.entity.ProductEntity;
import com.pie.trainingtask.customerapp.mapper.AddressMapper;
import com.pie.trainingtask.customerapp.mapper.CustomerMapper;
import com.pie.trainingtask.customerapp.mapper.ProductMapper;
import com.pie.trainingtask.customerapp.repository.CustomerRepository;
import com.pie.trainingtask.customerapp.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerMapper customerMapper;

    @Autowired
    AddressMapper addressMapper;

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Customer> getAllCustomers() {
        return customerMapper.map(customerRepository.findAll());
    }

    @Override
    public Customer getCustomer(Long id) {

        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");

        return customerRepository.findById(id).map(customerMapper::map).orElseThrow();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        CustomerEntity customerEntity = customerMapper.map(customer);

        customerEntity = addCustomerReferenceToAddressEntity(customer, customerEntity);

        customerEntity = addCustomerRefernceToProductEntity(customer, customerEntity);

        return customerMapper.map(customerRepository.save(customerEntity));
    }

    private CustomerEntity addCustomerRefernceToProductEntity(Customer customer, CustomerEntity customerEntity) {
        List<ProductEntity> productEntities = productMapper.map(customer.getProducts());
        productEntities.forEach(productEntity -> productEntity.setCustomerEntity(customerEntity));
        customerEntity.setProducts(productEntities);
        return customerEntity;
    }

    private CustomerEntity addCustomerReferenceToAddressEntity(Customer customer, CustomerEntity customerEntity) {
        List<AddressEntity> addressEntities = addressMapper.map(customer.getAddresses());
        addressEntities.forEach(addressEntity -> addressEntity.setCustomerEntity(customerEntity));
        customerEntity.setAddresses(addressEntities);
        return customerEntity;
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        CustomerEntity customerEntity = customerRepository.findById(id).orElseThrow();
        //CustomerEntity customerEntity = customerMapper.map(customer);
        customerEntity.setName(customer.getName());
        customerEntity.setAge(customer.getAge());
        customerEntity.setMobile(customer.getMobile());
        customerEntity = addCustomerReferenceToAddressEntity(customer, customerEntity);
        customerEntity = addCustomerRefernceToProductEntity(customer, customerEntity);
        return customerMapper.map(customerRepository.save(customerEntity));
    }

    @Override
    public void deleteCustomer(Long id) {
        Customer customer = customerRepository.findById(id).map(customerMapper::map).orElseThrow();
        customerRepository.delete(customerMapper.map(customer));
    }
}
