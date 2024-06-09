package com.example.project.service;

import com.example.project.dto.request.ProductRequest;
import com.example.project.dto.response.CategoryDTO;
import com.example.project.dto.response.ImageDTO;
import com.example.project.dto.response.ProductDTO;
import com.example.project.entity.Category;
import com.example.project.entity.Image;
import com.example.project.entity.Product;
import com.example.project.exception.CategoryNotExistException;
import com.example.project.exception.ImageNotExistException;
import com.example.project.exception.ProductNotExistException;
import com.example.project.repository.CategoryRepo;
import com.example.project.repository.ImageRepo;
import com.example.project.repository.ProductRepo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepo productRepo;
    private ImageRepo imageRepo;
    private CategoryRepo categoryRepo;


    public void addProduct(ProductRequest request)
            throws CategoryNotExistException {
        Image image = new Image();
        image.setImage(request.getImage());
        image.setAlt(request.getAlt());
        image = imageRepo.save(image);

        Category category = categoryRepo.findById(request.getCategoryId()).
                orElseThrow(() -> new CategoryNotExistException("Категория не найдена"));

        Product product = new Product();
        product.setTitle(request.getTitle());
        product.setImageRecord(image);
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
        product.setDiscountPrice(request.getDiscountPrice());
        product.setQuantityOfAvailable(request.getQuantityOfAvailable());
        product.setUnit(request.getUnit());
        product.setDeliveryDays(request.getDeliveryDays());
        product.setCategoryRecord(category);

        productRepo.save(product);
    }

    public void updateProductById(Integer productId, ProductRequest request)
            throws ProductNotExistException, CategoryNotExistException {
        Product product = productRepo.findById(productId).
                orElseThrow(() -> new ProductNotExistException("Продукт не найден"));

        Image image = product.getImageRecord();
        if (request.getImage() != null) {
            image.setImage(request.getImage());
        }
        if (request.getAlt() != null) {
            image.setAlt(request.getAlt());
        }
        product.setImageRecord(image);

        if (request.getCategoryId() != null) {
            product.setCategoryRecord(categoryRepo.findById(request.getCategoryId()).
                    orElseThrow(() -> new CategoryNotExistException("Категория не найдена")));
        }

        productRepo.save(product);
    }

    public List<ProductDTO> getFullAssortment() {
        return productRepo.findAll().
                stream().map(ProductDTO::new).collect(Collectors.toList());
    }

    public List<ProductDTO> getSpecialOffers() {
        return productRepo.findSpecialOffers().
                stream().map(ProductDTO::new).collect(Collectors.toList());
    }

    public ImageDTO getImageById(Integer imageId) throws ImageNotExistException {
        Image foundImage = imageRepo.findById(imageId).
                orElseThrow(() -> new ImageNotExistException("Изображение не найдено"));
        return ImageDTO.builder().
                imageId(foundImage.getImageId()).
                image(foundImage.getImage()).
                alt(foundImage.getAlt()).
                build();
    }

    public List<CategoryDTO> getAllAvailableCategories() {
        return categoryRepo.findAll().
                stream().map(CategoryDTO::new).collect(Collectors.toList());
    }
}
