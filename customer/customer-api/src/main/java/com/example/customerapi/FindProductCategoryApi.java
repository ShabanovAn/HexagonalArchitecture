package com.example.customerapi;

import com.example.customershared.ProductCategoryData;
import com.example.customershared.ProductCategoryId;

import java.util.Optional;

@FunctionalInterface
public interface FindProductCategoryApi {

    Optional<ProductCategoryData> findProductCategory(ProductCategoryId id);
}
