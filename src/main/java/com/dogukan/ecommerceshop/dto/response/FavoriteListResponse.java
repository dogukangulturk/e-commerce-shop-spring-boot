package com.dogukan.ecommerceshop.dto.response;

import java.util.List;

public record FavoriteListResponse(String id, String name, List<ProductResponse> products) {
}