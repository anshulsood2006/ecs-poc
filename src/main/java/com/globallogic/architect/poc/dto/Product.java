package com.globallogic.architect.poc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class Product {
    private long id;
    private String name;
    private double price;
}
