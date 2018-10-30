package com.example.demo.service;


import com.example.demo.entity.Provider;

import java.util.List;

public interface ProviderService {

    Provider save(Provider provider);
    List<Provider> findAll();
    List<Provider> findAllById(Iterable<Long> iterable);
    void deleteById(Long id);


}
