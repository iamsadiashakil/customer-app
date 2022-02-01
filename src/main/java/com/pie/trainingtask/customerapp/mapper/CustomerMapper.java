package com.pie.trainingtask.customerapp.mapper;

import com.pie.trainingtask.customerapp.dto.Customer;
import com.pie.trainingtask.customerapp.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javax.persistence.Column;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(source = "entity.id", target = "id")
    @Mapping(source = "entity.name", target = "name")
    @Mapping(source = "entity.age", target = "age")
    @Mapping(source = "entity.mobile", target = "mobile")
    Customer map(CustomerEntity entity);

    @Mapping(source = "customer.id", target = "id")
    @Mapping(source = "customer.name", target = "name")
    @Mapping(source = "customer.age", target = "age")
    @Mapping(source = "customer.mobile", target = "mobile")
    CustomerEntity map(Customer customer);

    List<Customer> map(List<CustomerEntity> entities);
}