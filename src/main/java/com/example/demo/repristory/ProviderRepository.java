package com.example.demo.repristory;

import com.example.demo.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProviderRepository extends JpaRepository<Provider,Long> {
    @Override
    <S extends Provider> S save(S s);

    @Override
    List<Provider> findAll();

    @Override
    List<Provider> findAllById(Iterable<Long> iterable);

    @Override
    void deleteById(Long aLong);
}
