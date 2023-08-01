package com.dogukan.ecommerceshop.dto.request;

import org.springframework.web.multipart.MultipartFile;

public record ProductRequest(
        String name,
        String description,
        double price,
        MultipartFile productPhoto
) {
}
