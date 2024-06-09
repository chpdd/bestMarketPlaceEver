package com.example.project.dto.response;

import com.example.project.entity.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDTO {
    @JsonProperty("product_id")
    private int productId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("image_url")
    private String imageUrl;

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

    @JsonProperty("category")
    private CategoryDTO category;

    public ProductDTO(Product product) {
        productId = product.getProductId();
        title = product.getTitle();

        Integer imageId = product.getImageRecord().getImageId();

//        TODO: нужно сделать вытягивание порта из конфига
        imageUrl = "http://localhost" + 8081 + "/products/image/" + imageId;

        description = product.getDescription();
        price = product.getPrice();
        discountPrice = product.getDiscountPrice();
        quantityOfAvailable = product.getQuantityOfAvailable();
        unit = product.getUnit();
        deliveryDays = product.getDeliveryDays();
        category = new CategoryDTO(product.getCategoryRecord());
    }
}
