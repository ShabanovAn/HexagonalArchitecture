package ru.shabanov.catalogue;

import ru.shabanov.catalogue.data.ProductCategoryData;
import ru.shabanov.catalogue.id.ProductCategoryId;

import java.util.Optional;

@FunctionalInterface
public interface FuncProductCategoryApi {

    Optional<ProductCategoryData> findProductCategory(ProductCategoryId id);
}
