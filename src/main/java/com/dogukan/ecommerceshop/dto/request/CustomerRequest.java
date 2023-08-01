package com.dogukan.ecommerceshop.dto.request;

import org.springframework.web.multipart.MultipartFile;

public record CustomerRequest(
        String name,
        String email,
        String address,
        String phone,
        MultipartFile profilePhoto
) {
}
