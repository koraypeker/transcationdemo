package com.example.transcationdemo.step16;

import com.example.transcationdemo.entity.ProductEntity;
import com.example.transcationdemo.entity.SupplierEntity;
import com.example.transcationdemo.repository.ProductRepository;
import com.example.transcationdemo.repository.SupplierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class Step161ServiceImpl implements Step161Service {

    private final ProductRepository productRepository;
    private final SupplierRepository supplierRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void anyMethod() {

        SupplierEntity supplier = new SupplierEntity("Step16 Supplier");
        supplierRepository.save(supplier);

        ProductEntity productEntity = new ProductEntity("Step16 Product2");
        productRepository.save(productEntity);

    }

}
