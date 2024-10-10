package ru.shabanov.catalogue.id;

public record ProductCategoryId(Long value) {

    public static ProductCategoryId fromLong(long value) {
        return value > 0 ? new ProductCategoryId(value) : null;
    }
}
