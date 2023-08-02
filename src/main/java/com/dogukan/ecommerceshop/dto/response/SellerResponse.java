package com.dogukan.ecommerceshop.dto.response;

import java.util.List;

public record SellerResponse(String id,
                             String name,
                             String email,
                             String address,
                             String phone,
                             double rating,
                             List<ProductResponse> products,
                             List<OrderResponse> previousSales) {
}
