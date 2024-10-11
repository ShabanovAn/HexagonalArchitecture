package webmvc.presentation;

import id.ProductCategoryId;

public record ProductCategoryPresentationV1(ProductCategoryId id, String name, String detais,
                                            Long parentId, int version) {
}
