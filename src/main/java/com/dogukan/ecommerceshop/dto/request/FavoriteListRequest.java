package com.dogukan.ecommerceshop.dto.request;

import java.util.List;

public record FavoriteListRequest(
        String name,
        List<String> productIds
) {
}
