package com.example.project.entity;

import com.example.project.dto.response.CategoryDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "title")
    private String title;

    @OneToOne
    @JoinColumn(name = "image_id", referencedColumnName = "image_id")
    private Image imageRecord;

    @Column(name = "description")
    private String description;

    @Column(name = "price", precision = 18, scale = 2)
    private BigDecimal price;

    @Column(name = "discount_price", precision = 18, scale = 2)
    private BigDecimal discountPrice;

    @Column(name = "quantity_of_available")
    private Integer quantityOfAvailable;

    @Column(name = "unit")
    private String unit;

    @Column(name = "delivery_days")
    private Integer deliveryDays;

    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category categoryRecord;

    @OneToMany
    private List<OrderedProduct> productOrders;
}
