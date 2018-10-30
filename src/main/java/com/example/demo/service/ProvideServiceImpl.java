package com.example.demo.service;

import com.example.demo.entity.Provider;
import com.example.demo.repristory.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvideServiceImpl implements ProviderService{

    @Autowired
    private ProviderRepository providerRepository;


    @Override
    public Provider save(Provider provider) {
        return providerRepository.save(provider);
    }

    @Override
    public List<Provider> findAll() {
        return providerRepository.findAll();
    }

    @Override
    public List<Provider> findAllById(Iterable<Long> iterable) {
        return providerRepository.findAllById(iterable);
    }

    @Override
    public void deleteById(Long id) {
        providerRepository.deleteById(id);
    }
}
