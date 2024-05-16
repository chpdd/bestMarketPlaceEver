package com.example.project.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "Orders")
public class Order {
    @Id
    private Integer order_id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User order_user;

    private LocalDate datetime;

    @ManyToOne
    @JoinColumn(name = "point_id", referencedColumnName = "point_id")
    private PickupPoint order_pickup_point;

    private boolean completed;

    @OneToMany(mappedBy = "order_product")
    private List<OrderedProduct> order_products;
}