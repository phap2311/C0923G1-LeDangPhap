package com.example.baitap_quan_ly_userss.service;

import com.example.baitap_quan_ly_userss.models.User;
import com.example.baitap_quan_ly_userss.repository.IUserRepository;
import com.example.baitap_quan_ly_userss.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class UserService implements IUserService {
    private IUserRepository iUserRepository = new UserRepository();

    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }

    @Override
    public User findById(Integer id) {
        return iUserRepository.findById(id);
    }

    @Override
    public boolean editUser(User user) {
        return iUserRepository.editUser(user);
    }

    @Override
    public boolean remove(int id) {
        return iUserRepository.remove(id);
    }

    @Override
    public List<User> findByCountry(String country) {
        return iUserRepository.findByCountry(country);
    }
}

