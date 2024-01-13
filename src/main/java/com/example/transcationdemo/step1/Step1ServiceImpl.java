package com.example.transcationdemo.step1;

import com.example.transcationdemo.entity.ProductEntity;
import com.example.transcationdemo.entity.SupplierEntity;
import com.example.transcationdemo.repository.ProductRepository;
import com.example.transcationdemo.repository.SupplierRepository;
import com.example.transcationdemo.util.ExceptionUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Step1ServiceImpl implements Step1Service {

    private final ProductRepository productRepository;
    private final SupplierRepository supplierRepository;

    @Override
    public void run() {

        ProductEntity productEntity = new ProductEntity("Step1 Product");
        productRepository.save(productEntity);

        ExceptionUtil.generateException();

        SupplierEntity supplier = new SupplierEntity("Step1 Supplier");
        supplierRepository.save(supplier);

    }
}
