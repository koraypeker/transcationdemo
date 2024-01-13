package com.example.transcationdemo.step2;

import com.example.transcationdemo.entity.ProductEntity;
import com.example.transcationdemo.entity.SupplierEntity;
import com.example.transcationdemo.repository.ProductRepository;
import com.example.transcationdemo.repository.SupplierRepository;
import com.example.transcationdemo.util.ExceptionUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Step2ServiceImpl implements Step2Service {

    private final ProductRepository productRepository;
    private final SupplierRepository supplierRepository;

    @Override
    public void run() {

        ProductEntity productEntity = new ProductEntity("Step2 Product");
        productRepository.save(productEntity);

        try {
            ExceptionUtil.generateException();
        } catch (Exception e) {
            System.out.println(e);
        }

        SupplierEntity supplier = new SupplierEntity("Step2 Supplier");
        supplierRepository.save(supplier);

    }

}
