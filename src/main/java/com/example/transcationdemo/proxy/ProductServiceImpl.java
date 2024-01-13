package com.example.transcationdemo.proxy;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    @Transactional
    public void createProduct() {
        System.out.println("Product Created");
    }
}
