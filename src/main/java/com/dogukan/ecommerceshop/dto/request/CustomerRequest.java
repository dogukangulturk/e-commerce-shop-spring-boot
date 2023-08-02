package com.dogukan.ecommerceshop.dto.request;

import org.springframework.web.multipart.MultipartFile;

public record CustomerRequest(
        String username,
        String password,
        String firstName,
        String lastName,
        String email,
        String address,
        String phone,
        MultipartFile profilePhoto
) {
}
