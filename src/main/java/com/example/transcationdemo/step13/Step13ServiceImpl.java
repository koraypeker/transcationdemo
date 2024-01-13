package com.example.transcationdemo.step13;

import com.example.transcationdemo.entity.ProductEntity;
import com.example.transcationdemo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class Step13ServiceImpl implements Step13Service {

    private final ProductRepository productRepository;
    private final Step131Service step131Service;

    @Override
    @Transactional
    public void run() {

        ProductEntity productEntity = new ProductEntity("Step13 Product");
        productRepository.save(productEntity);

        step131Service.anyMethod();
    }

}
