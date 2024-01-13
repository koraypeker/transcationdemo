package com.example.transcationdemo.proxy;

public class ProxyProductService implements ProductService {

    private ProductServiceImpl productService;

    @Override
    public void createProduct() {

        if (productService == null) {
            productService = new ProductServiceImpl();
        }

        try {
            // Get Transaction
            productService.createProduct();
        } catch (Exception e) {
            // Rollback Transaction
        }
        // Commit Transaction
    }
}
