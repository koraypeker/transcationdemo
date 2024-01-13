package com.example.transcationdemo.step7;

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
public class Step7ServiceImpl implements Step7Service {

    private final ProductRepository productRepository;
    private final SupplierRepository supplierRepository;

    @Override
    @Transactional
    public void run() {

        ProductEntity productEntity = new ProductEntity("Step7 Product");
        productRepository.save(productEntity);

        anyMethod();
    }

    private void anyMethod() {

        ExceptionUtil.generateException();

        SupplierEntity supplier = new SupplierEntity("Step7 Supplier");
        supplierRepository.save(supplier);
    }

}
