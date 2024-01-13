package com.example.transcationdemo.step16;

import com.example.transcationdemo.entity.ProductEntity;
import com.example.transcationdemo.repository.ProductRepository;
import com.example.transcationdemo.util.ExceptionUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class Step16ServiceImpl implements Step16Service {

    private final ProductRepository productRepository;
    private final Step161Service step161Service;

    @Override
    @Transactional
    public void run() {

        ProductEntity productEntity = new ProductEntity("Step16 Product");
        productRepository.save(productEntity);

        step161Service.anyMethod();

        ExceptionUtil.generateException();
    }

}
