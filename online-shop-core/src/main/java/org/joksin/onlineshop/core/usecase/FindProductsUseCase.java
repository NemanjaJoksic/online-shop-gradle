package org.joksin.onlineshop.core.usecase;

import org.joksin.onlineshop.core.model.Product;

import java.util.List;

public interface FindProductsUseCase {

    List<Product> findAll();

}
