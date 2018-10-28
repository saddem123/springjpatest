package com.example.demo.service;

import com.example.demo.entity.Users;

import java.util.List;

public interface UsersService  {
    Users save(Users users);
    List<Users> findAll();

}
