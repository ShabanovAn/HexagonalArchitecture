package webmvc;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.shabanov.catalogue.api.FindProductCategoryApi;
import ru.shabanov.catalogue.api.spring.webmvc.presentation.ProductCategoryPresentationV1;
import ru.shabanov.catalogue.id.ProductCategoryId;

@RestController
public class FindProductCategoryRestController {

    private final FindProductCategoryApi findProductCategoryApi;

    public FindProductCategoryRestController(FindProductCategoryApi findProductCategoryApi) {
        this.findProductCategoryApi = findProductCategoryApi;
    }

    @GetMapping(path = "/api/catalogue/product-categories/{id:\\d+}",
    produces = "application/vnd.selmag.catalogue.product-category.v1+json")
    public ResponseEntity<ProductCategoryPresentationV1> findProductCategory(@PathVariable("id") long id) {
        return  this.findProductCategoryApi.findProductCategoryById(new ProductCategoryId(id))
                .map(category -> ResponseEntity.ok(new ProductCategoryPresentationV1(category.id().value(), category.title(),
                        category.details(), category.parentId() != null ? category.parentId().value() : null,
                        category.version())))
                .orElse(ResponseEntity.notFound().build());
    }
}
