package com.dogukan.ecommerceshop.dto.request;

import java.util.List;

public record OrderRequest(
        String customerId,
        List<OrderItemRequest> orderItems
) {
}
