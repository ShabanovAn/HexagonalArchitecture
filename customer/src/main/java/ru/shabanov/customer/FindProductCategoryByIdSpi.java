package ru.shabanov.customer;

import com.example.customershared.ProductCategoryData;
import com.example.customershared.ProductCategoryId;

import java.util.Optional;

@FunctionalInterface
public interface FindProductCategoryByIdSpi {

    Optional<ProductCategoryData> findProductCategoryById(ProductCategoryId id);
}
