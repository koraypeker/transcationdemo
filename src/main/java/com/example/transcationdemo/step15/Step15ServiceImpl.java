package com.example.transcationdemo.step15;

import com.example.transcationdemo.entity.ProductEntity;
import com.example.transcationdemo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Step15ServiceImpl implements Step15Service {

    private final ProductRepository productRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ProductEntity> run() {
        return productRepository.findAll();
    }
}
