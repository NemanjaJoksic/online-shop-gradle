package org.joksin.onlineshop.core.usecase;

import org.joksin.onlineshop.core.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class FindProductsUseCaseImpl implements FindProductsUseCase {

    @Override
    public List<Product> findAll() {
        var product1 = Product.builder()
                              .id(1L)
                              .name("Cokolada")
                              .build();

        var product2 = Product.builder()
                              .id(2L)
                              .name("Kafa")
                              .build();

        return List.of(product1, product2);
    }

}
