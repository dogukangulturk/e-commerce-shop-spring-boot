package com.dogukan.ecommerceshop.dto.request;

import org.springframework.web.multipart.MultipartFile;

public record CategoryRequest(
        String name,
        MultipartFile categoryPhoto
) {
}
