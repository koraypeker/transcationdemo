package com.example.transcationdemo.step13;

import com.example.transcationdemo.entity.ProductEntity;
import com.example.transcationdemo.entity.SupplierEntity;
import com.example.transcationdemo.repository.ProductRepository;
import com.example.transcationdemo.repository.SupplierRepository;
import com.example.transcationdemo.util.ExceptionUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class Step131ServiceImpl implements Step131Service {

    private final ProductRepository productRepository;
    private final SupplierRepository supplierRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void anyMethod() {

        SupplierEntity supplier = new SupplierEntity("Step13 Supplier");
        supplierRepository.save(supplier);

        ExceptionUtil.generateException();

        ProductEntity productEntity = new ProductEntity("Step13 Product2");
        productRepository.save(productEntity);

    }

}
