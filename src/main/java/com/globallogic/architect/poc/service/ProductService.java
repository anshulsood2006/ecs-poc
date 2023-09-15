package com.globallogic.architect.poc.service;

import com.globallogic.architect.poc.dto.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public Product getProduct(long id){
        return new Product(id, "Toy", 23.06);
    }

}
