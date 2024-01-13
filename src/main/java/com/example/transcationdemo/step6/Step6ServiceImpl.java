package com.example.transcationdemo.step6;

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
public class Step6ServiceImpl implements Step6Service {

    private final ProductRepository productRepository;
    private final SupplierRepository supplierRepository;

    @Override
    @Transactional
    public void run() {

        ProductEntity productEntity = new ProductEntity("Step6 Product");
        productRepository.save(productEntity);

        ExceptionUtil.generateException();

        insertSupplier();
    }

    @Override
    public void insertSupplier() {
        SupplierEntity supplier = new SupplierEntity("Step6 Supplier");
        supplierRepository.save(supplier);
    }

}
