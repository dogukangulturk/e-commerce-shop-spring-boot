package com.dogukan.ecommerceshop.dto.request;

import java.util.List;

public record SellerRequest(
        String name,
        String email,
        String address,
        String phone,
        List<ProductRequest> products,
        List<OrderRequest> previousSales
) {
}
