package com.dogukan.ecommerceshop.dto.response;

import org.springframework.web.multipart.MultipartFile;

public record ProductResponse(String id,
                              String name,
                              String description,
                              double price,
                              double rating,
                              String productPhotoUrl) {
}
