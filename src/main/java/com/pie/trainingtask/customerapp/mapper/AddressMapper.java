package com.pie.trainingtask.customerapp.mapper;

import com.pie.trainingtask.customerapp.dto.Address;
import com.pie.trainingtask.customerapp.entity.AddressEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address map(AddressEntity entity);

    AddressEntity map(Address address);

    List<AddressEntity> map(List<Address> addresses);


}
