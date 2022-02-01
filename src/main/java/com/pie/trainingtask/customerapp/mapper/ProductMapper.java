package com.pie.trainingtask.customerapp.mapper;

import com.pie.trainingtask.customerapp.dto.Product;
import com.pie.trainingtask.customerapp.entity.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product map(ProductEntity entity);

    ProductEntity map(Product product);

    List<ProductEntity> map(List<Product> products);
}
