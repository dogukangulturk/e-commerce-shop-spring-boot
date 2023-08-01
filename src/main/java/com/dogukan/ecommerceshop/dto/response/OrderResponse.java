package com.dogukan.ecommerceshop.dto.response;

import java.util.List;

public record OrderResponse(String id, String customerId, List<OrderItemResponse> items, String status) {}

