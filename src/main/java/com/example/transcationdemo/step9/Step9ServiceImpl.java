package com.example.transcationdemo.step9;

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
public class Step9ServiceImpl implements Step9Service {

    private final ProductRepository productRepository;
    private final SupplierRepository supplierRepository;

    @Override
    @Transactional
    public void run() {

        ProductEntity productEntity = new ProductEntity("Step9 Product");
        productRepository.save(productEntity);

        try {
            ExceptionUtil.generateException();

            SupplierEntity supplier = new SupplierEntity("Step9 Supplier");
            supplierRepository.save(supplier);
        } catch (Exception e) {

        }

    }

}
