package org.joksin.onlineshop.core.model;

import lombok.Builder;

@Builder
public record Product(
        Long id,
        String name
) {}
