package com.example.baitap_quan_ly_userss.service;

import com.example.baitap_quan_ly_userss.models.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    void save(User user);

    User findById(Integer id);

    boolean editUser(User user);

    boolean remove(int id);

    List<User> findByCountry(String country);
}
