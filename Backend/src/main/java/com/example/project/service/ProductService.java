package com.example.project.service;

import com.example.project.dto.response.ImageDTO;
import com.example.project.dto.response.ProductDTO;
import com.example.project.entity.Image;
import com.example.project.entity.Product;
import com.example.project.exception.ProductNotExistException;
import com.example.project.repository.CategoryRepo;
import com.example.project.repository.ImageRepo;
import com.example.project.repository.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepo productRepo;
    private ImageRepo imageRepo;
    private CategoryRepo categoryRepo;

    public void saveProduct(Product product){
        productRepo.save(product);
    }

    public List<ProductDTO> getFullAssortment() {
        return productRepo.findAll().
                stream().map(ProductDTO::new).collect(Collectors.toList());
    }

    public ImageDTO getImageById(Integer imageId) throws ProductNotExistException {
        Image foundImage = imageRepo.findById(imageId).
                orElseThrow(() -> new ProductNotExistException("Изображение не найдено"));
        return ImageDTO.builder().
                imageId(foundImage.getImageId()).
                image(foundImage.getImage()).
                alt(foundImage.getAlt()).
                build();
    }

    public List<ProductDTO> getSpecialOffers() {
        return productRepo.findSpecialOffers().
                stream().map(ProductDTO::new).collect(Collectors.toList());
    }

    public List<String> getAvailableCategories() {
        return categoryRepo.findAll().
                stream().map().collect(Collectors.toList());
    }
}
