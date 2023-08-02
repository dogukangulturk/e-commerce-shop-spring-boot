package com.dogukan.ecommerceshop.dto.response;

public record OrderItemResponse(String productId,
                                String productName,
                                int quantity,
                                double totalPrice) {
}

