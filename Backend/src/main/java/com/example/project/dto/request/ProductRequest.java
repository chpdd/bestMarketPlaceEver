package com.example.project.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
public class ProductRequest {
    @JsonProperty("title")
    private String title;

    @JsonProperty("image")
    private byte[] image;
    @JsonProperty("alt")
    private String alt;

    @JsonProperty("description")
    private String description;

    @JsonProperty("price")
    private BigDecimal price;

    @JsonProperty("discount_price")
    private BigDecimal discountPrice;

    @JsonProperty("quantity_of_available")
    private Integer quantityOfAvailable;

    @JsonProperty("unit")
    private String unit;

    @JsonProperty("delivery_days")
    private Integer deliveryDays;

    @JsonProperty("category_id")
    private Integer categoryId;
}
