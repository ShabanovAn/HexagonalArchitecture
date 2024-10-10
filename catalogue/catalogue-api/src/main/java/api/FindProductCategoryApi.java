package api;

import data.ProductCategoryData;
import id.ProductCategoryId;

import java.util.Optional;

@FunctionalInterface
public interface FindProductCategoryApi {

    Optional<ProductCategoryData> findProductCategoryById(ProductCategoryId id);
}
