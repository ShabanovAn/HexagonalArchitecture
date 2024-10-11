package ru.shabanov.customerspi;

import com.example.customershared.ProductCategoryData;
import com.example.customershared.ProductCategoryId;

import java.util.Optional;

@FunctionalInterface
public interface FindProductCategotyByIdSpi {

    Optional<ProductCategoryData> findProductCategoryById(ProductCategoryId id);
}
