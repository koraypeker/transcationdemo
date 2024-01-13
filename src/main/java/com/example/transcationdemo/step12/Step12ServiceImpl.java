package com.example.transcationdemo.step12;

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
public class Step12ServiceImpl implements Step12Service {

    private final ProductRepository productRepository;
    private final SupplierRepository supplierRepository;

    @Override
    @Transactional
    public void run() {

        ProductEntity productEntity = new ProductEntity("Step12 Product");
        productRepository.save(productEntity);

        try {
            anyMethod();
        } catch (Exception e) {

        }
    }

    private void anyMethod() {

        SupplierEntity supplier = new SupplierEntity("Step12 Supplier");
        supplierRepository.save(supplier);

        ExceptionUtil.generateException();

        ProductEntity productEntity = new ProductEntity("Step12 Product2");
        productRepository.save(productEntity);

    }

}
