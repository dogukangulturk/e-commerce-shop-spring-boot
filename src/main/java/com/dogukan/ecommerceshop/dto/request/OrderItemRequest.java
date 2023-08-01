package com.dogukan.ecommerceshop.dto.request;

public record OrderItemRequest(
        String productId,
        int quantity
) {
}
