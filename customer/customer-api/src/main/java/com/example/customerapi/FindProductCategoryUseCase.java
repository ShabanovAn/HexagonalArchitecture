package com.example.customerapi;

import com.example.customershared.ProductCategoryData;
import com.example.customershared.ProductCategoryId;
import ru.shabanov.customer.FindProductCategoryByIdSpi;

import java.util.Optional;

public class FindProductCategoryUseCase implements FindProductCategoryApi{

    private final FindProductCategoryByIdSpi findProductCategoryByIdSpi;

    public FindProductCategoryUseCase(FindProductCategoryByIdSpi findProductCategoryByIdSpi) {
        this.findProductCategoryByIdSpi = findProductCategoryByIdSpi;
    }

    @Override
    public Optional<ProductCategoryData> findProductCategory(ProductCategoryId id) {
        return Optional.empty();
    }
}
