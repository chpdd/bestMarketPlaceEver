package com.example.project.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ImageDTO {
    private Integer imageId;
    private byte[] image;
    private String alt;
}
