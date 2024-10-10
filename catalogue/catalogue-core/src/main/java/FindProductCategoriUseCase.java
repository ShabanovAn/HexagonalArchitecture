


import api.FindProductCategoryApi;
import data.ProductCategoryData;
import id.ProductCategoryId;

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
