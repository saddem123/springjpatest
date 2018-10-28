package com.example.demo.service;

import com.example.demo.entity.Users;
import com.example.demo.repristory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService  {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users save(Users users){
         return this.userRepository.save(users);
    }

    @Override
    public List<Users> findAll() {
        return this.userRepository.findAll();
    }


}
