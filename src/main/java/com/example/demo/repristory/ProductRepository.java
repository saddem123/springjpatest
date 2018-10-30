package com.example.demo.repristory;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Override
    <S extends Product> S save(S s);

    @Override
    List<Product> findAll();

    @Override
    void deleteById(Long id);
}
