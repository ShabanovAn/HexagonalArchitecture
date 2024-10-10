package ru.shabanov.catalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.shabanov.catalogue.api.usecase.FindProductCategoriUseCase;
import ru.shabanov.catalogue.spi.spring.jdbs.MappingSqlQueryFindProductCategoryById;

import javax.sql.DataSource;

@SpringBootApplication
public class CatalogueApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalogueApplication.class, args);
    }

    @Bean
    FindProductCategoriUseCase findProductCategoriUseCase(DataSource dataSource) {
        return new FindProductCategoriUseCase(new MappingSqlQueryFindProductCategoryById(dataSource));

    }

}
