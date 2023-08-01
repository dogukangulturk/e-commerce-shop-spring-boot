package com.dogukan.ecommerceshop.dto.response;

public record CustomerResponse(String id,
                               String name,
                               String email,
                               String address,
                               String phone,
                               String profilePhotoUrl) {
}
