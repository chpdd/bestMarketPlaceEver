package com.example.project.controller;

import com.example.project.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/ordered-products/{orderId}")
    public ResponseEntity<?> getOrderedProductsByOrderId(@PathVariable Integer orderId) {
        try {
            return new ResponseEntity<>(orderService.getAllByOrderId(orderId), HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "Добро пожаловать ";
    }
    @GetMapping("/user")
    @PreAuthorize("hasAnyAuthority('costumer')")
    public String User(){
        return "User";
    }
    @GetMapping("/m")
    @PreAuthorize("hasAnyAuthority('manager')")
    public String Manager(){
        return "Manager";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasAnyAuthority('administrator')")
    public String Admin(){
        return "Admin";
    }
}
