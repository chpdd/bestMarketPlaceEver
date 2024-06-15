package com.example.project.controller;

import com.example.project.dto.request.ProductRequest;
import com.example.project.exception.CategoryNotExistException;
import com.example.project.exception.ImageNotExistException;
import com.example.project.exception.ProductNotExistException;
import com.example.project.service.ProductService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;

    @PostMapping
    public ResponseEntity<?> addProduct(@Valid @RequestBody ProductRequest request) {
        try {
            return new ResponseEntity<>(productService.addProduct(request), HttpStatus.OK);
        } catch (CategoryNotExistException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateProductById(@PathVariable Integer id,
                                               @Valid @RequestBody ProductRequest request) {
        try {
            return new ResponseEntity<>(productService.updateProductById(id, request), HttpStatus.OK);
        } catch (CategoryNotExistException | ProductNotExistException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/assortment")
    public ResponseEntity<?> getFullAssortment() {
        try {
            return new ResponseEntity<>(productService.getFullAssortment(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/image/{id}")
    public ResponseEntity<?> getImageById(@PathVariable Integer id) {
        try {
            return new ResponseEntity<>(productService.getImageById(id), HttpStatus.OK);
        } catch (ImageNotExistException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/special")
    public ResponseEntity<?> getSpecialOffers() {
        try {
            return new ResponseEntity<>(productService.getSpecialOffers(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/categories")
    public ResponseEntity<?> getAllAvailableCategories() {
        try {
            return new ResponseEntity<>(productService.getAllAvailableCategories(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }
    }

//    @GetMapping("/image/{imageId}")
//    public ResponseEntity<byte[]> getImage(@PathVariable Integer imageId) {
//        try {
//            byte[] image = productService.get(imageId);
//            return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(image);
//        } catch (ProductNotExistException e) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//    }

//    @PostMapping("/image")
//    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file, @RequestParam("altText") String altText) {
//        try {
//            productService.uploadImage(file, altText);
//            return ResponseEntity.status(HttpStatus.CREATED).body("Изображение успешно загружено");
//        } catch (IOException e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ошибка загрузки изображения");
//        }
//    }
}
