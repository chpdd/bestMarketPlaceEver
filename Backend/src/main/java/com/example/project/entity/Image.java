package com.example.project.entity;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "Image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private Integer imageId;

    @Lob
    @Column(name = "image")
    private byte[] image;

    @Column(name = "alt")
    private String alt;

    @OneToOne
    private Product product;
}
