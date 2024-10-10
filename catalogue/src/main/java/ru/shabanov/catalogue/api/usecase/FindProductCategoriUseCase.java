package ru.shabanov.catalogue.api.usecase;

import ru.shabanov.catalogue.data.ProductCategoryData;
import ru.shabanov.catalogue.id.ProductCategoryId;
import ru.shabanov.catalogue.spi.FindProductCategoryByIdSpi;

import java.util.Optional;

public class FindProductCategoriUseCase implements FindProductCategoryApi {

    private final FindProductCategoryByIdSpi findProductCategoryByIdSpi;

    public FindProductCategoriUseCase(FindProductCategoryByIdSpi findProductCategoryByIdSpi) {
        this.findProductCategoryByIdSpi = findProductCategoryByIdSpi;
    }

    @Override
    public Optional<ProductCategoryData> findProductCategoryById(ProductCategoryId id) {
        return findProductCategoryByIdSpi.findProductCategoryById(id);
    }
}
