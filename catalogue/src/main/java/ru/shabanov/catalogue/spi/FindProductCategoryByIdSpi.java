package ru.shabanov.catalogue.spi;

import ru.shabanov.catalogue.data.ProductCategoryData;
import ru.shabanov.catalogue.id.ProductCategoryId;

import java.util.Optional;

@FunctionalInterface
public interface FindProductCategoryByIdSpi {

    Optional<ProductCategoryData> findProductCategoryById(ProductCategoryId id);


}
