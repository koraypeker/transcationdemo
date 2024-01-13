package com.example.transcationdemo.step8;

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
public class Step8ServiceImpl implements Step8Service {

    private final ProductRepository productRepository;
    private final SupplierRepository supplierRepository;

    @Override
    @Transactional
    public void run() {

        ProductEntity productEntity = new ProductEntity("Step8 Product");
        productRepository.save(productEntity);

        anyMethod();
    }

    private void anyMethod() {

        try {
            ExceptionUtil.generateException();
        } catch (Exception e) {
        }

        SupplierEntity supplier = new SupplierEntity("Step8 Supplier");
        supplierRepository.save(supplier);
    }

}
