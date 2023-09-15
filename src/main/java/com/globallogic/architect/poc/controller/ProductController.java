package com.globallogic.architect.poc.controller;

import com.globallogic.architect.poc.dto.Product;
import com.globallogic.architect.poc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") long id) {
        return productService.getProduct(id);
    }

    @GetMapping("/test")
    public Product getProduct() {
        return productService.getProduct(0);
    }


}
