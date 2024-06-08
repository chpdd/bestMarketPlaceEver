package com.example.project.repository;

import com.example.project.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    // Custom query to find distinct categories
    @Query("SELECT DISTINCT p.categories.name FROM Product p")
    List<String> findDistinctCategories();

     @Query("SELECT p FROM Product p WHERE p.price <> p.discountPrice")
    List<Product> findSpecialOffers();
}
