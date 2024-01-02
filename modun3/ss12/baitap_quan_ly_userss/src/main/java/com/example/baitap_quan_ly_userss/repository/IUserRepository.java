package com.example.baitap_quan_ly_userss.repository;

import com.example.baitap_quan_ly_userss.models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface IUserRepository {
    List<User> findAll();

    void save(User user);

    User findById(Integer id);


    boolean editUser(User user);

    boolean remove(int id);

    List<User> findByCountry(String country);
}
