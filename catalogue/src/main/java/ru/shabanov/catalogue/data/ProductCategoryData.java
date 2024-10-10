package ru.shabanov.catalogue.data;

import ru.shabanov.catalogue.id.ProductCategoryId;

public record ProductCategoryData(ProductCategoryId id, String title, String details,
                                  ProductCategoryId parentId, int version) {
}
