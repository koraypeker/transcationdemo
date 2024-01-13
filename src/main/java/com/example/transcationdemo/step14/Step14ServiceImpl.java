package com.example.transcationdemo.step14;

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
public class Step14ServiceImpl implements Step14Service {

    private final ProductRepository productRepository;
    private final SupplierRepository supplierRepository;

    @Override
    public void run() {

        ProductEntity productEntity = new ProductEntity("Step14 Product");
        productRepository.save(productEntity);

        anyMethod();
    }

    @Transactional
    public void anyMethod() {

        SupplierEntity supplier = new SupplierEntity("Step14 Supplier");
        supplierRepository.save(supplier);

        ExceptionUtil.generateException();

        ProductEntity productEntity = new ProductEntity("Step14 Product2");
        productRepository.save(productEntity);

    }

}
