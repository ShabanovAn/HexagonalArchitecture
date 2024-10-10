package ru.shabanov.catalogue.api;

import ru.shabanov.catalogue.data.ProductCategoryData;
import ru.shabanov.catalogue.id.ProductCategoryId;

import java.util.Optional;

@FunctionalInterface
public interface FindProductCategoryApi {

    Optional<ProductCategoryData> findProductCategory(ProductCategoryId id);
}
