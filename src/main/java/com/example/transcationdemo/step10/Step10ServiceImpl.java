package com.example.transcationdemo.step10;

import com.example.transcationdemo.entity.ProductEntity;
import com.example.transcationdemo.entity.SupplierEntity;
import com.example.transcationdemo.repository.ProductRepository;
import com.example.transcationdemo.repository.SupplierRepository;
import com.example.transcationdemo.util.ExceptionUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class Step10ServiceImpl implements Step10Service {

    private final ProductRepository productRepository;
    private final SupplierRepository supplierRepository;

    @Override
    @Transactional
    public void run() {

        ProductEntity productEntity = new ProductEntity("Step10 Product");
        productRepository.save(productEntity);

        insertSupplier();
    }

    @Override
    public void insertSupplier() {

        SupplierEntity supplier = new SupplierEntity("Step10 Supplier");
        supplierRepository.save(supplier);

        ExceptionUtil.generateException();

        ProductEntity productEntity = new ProductEntity("Step10 Product2");
        productRepository.save(productEntity);

    }

}
