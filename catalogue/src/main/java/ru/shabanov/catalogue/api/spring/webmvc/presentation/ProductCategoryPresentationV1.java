package ru.shabanov.catalogue.api.spring.webmvc.presentation;

public record ProductCategoryPresentationV1(long id, String name, String detais,
                                            Long parentId, int version) {
}
