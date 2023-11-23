package org.joksin.onlineshop.restapi.controller;

import lombok.AllArgsConstructor;
import org.joksin.onlineshop.core.usecase.FindProductsUseCase;
import org.joksin.onlineshop.restapi.dto.ProductDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    private final FindProductsUseCase findProductsUseCase;

    @GetMapping("/api/products")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDTO> findAll() {
        return findProductsUseCase.findAll()
                                  .stream()
                                  .map(product -> new ProductDTO(product.id(), product.name()))
                                  .toList();
    }

}
